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
package org.netbeans.modules.web.beans.navigation.actions;

import javax.swing.text.JTextComponent;

import org.netbeans.modules.j2ee.metadata.model.api.MetadataModel;
import org.netbeans.modules.web.beans.api.model.WebBeansModel;
import org.openide.filesystems.FileObject;


/**
 * @author ads
 *
 */
public interface ModelActionStrategy {

    public enum InspectActionId {
        OBSERVERS_CONTEXT,
        METHOD_CONTEXT,
        INJECTABLES_CONTEXT,
        CLASS_CONTEXT;
    }
    
    boolean isApplicable( InspectActionId id );
    
    boolean isApplicable( WebBeansModel model , Object[] context );
    
    void invokeModelAction( WebBeansModel model,
            MetadataModel<WebBeansModel> metaModel, Object[] subject,
            JTextComponent component, FileObject fileObject  );
}


