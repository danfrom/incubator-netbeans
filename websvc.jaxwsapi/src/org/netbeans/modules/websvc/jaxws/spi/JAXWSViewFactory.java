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

package org.netbeans.modules.websvc.jaxws.spi;

import org.netbeans.modules.websvc.jaxws.JAXWSViewAccessor;
import org.netbeans.modules.websvc.jaxws.api.JAXWSView;

/**
 * Most general way to create {@link WebServicesView} instances.
 * You are not permitted to create them directly; instead you implement
 * {@link WebServicesViewImpl} and use this factory.
 *
 * @author Peter Williams
 */
public final class JAXWSViewFactory {

    private JAXWSViewFactory() {
    }

    public static JAXWSView createJAXWSView(JAXWSViewImpl spiWebServicesView) {
        return JAXWSViewAccessor.getDefault().createJAXWSView(spiWebServicesView);
    }
	
}
