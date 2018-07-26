/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.tomcat5.ui.nodes.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.modules.tomcat5.deploy.TomcatModule;
import org.netbeans.modules.tomcat5.ui.nodes.TomcatWebModule;

import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.NodeAction;

/**
 * Action which displays selected web module in browser.
 *
 * @author Stepan Herold
 */
public class OpenURLAction extends NodeAction {
    
    protected void performAction (Node[] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            TomcatWebModuleCookie cookie = (TomcatWebModuleCookie)nodes[i].getCookie(TomcatWebModuleCookie.class);
            if (cookie instanceof TomcatWebModule) {
                TomcatWebModule tomcatWebMod = (TomcatWebModule)cookie;
                TomcatModule tomcatMod = tomcatWebMod.getTomcatModule();
                try {
                    URLDisplayer.getDefault().showURL(new URL(tomcatMod.getWebURL()));
                } catch (MalformedURLException e) {
                    Logger.getLogger(OpenURLAction.class.getName()).log(Level.INFO, null, e);
                }
            }
        }
    }

    protected boolean enable (Node[] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            TomcatWebModuleCookie cookie = (TomcatWebModuleCookie)nodes[i].getCookie(TomcatWebModuleCookie.class);
            if (cookie == null || !(cookie.isRunning())) {
                return false;
            }
        }
        return true;
    }

    public String getName () {
        return NbBundle.getMessage(OpenURLAction.class, "LBL_OpenInBrowserAction"); // NOI18N
    }
    
    protected boolean asynchronous() {
        return false;
    }

    public HelpCtx getHelpCtx () {
        return HelpCtx.DEFAULT_HELP;
    }

}
