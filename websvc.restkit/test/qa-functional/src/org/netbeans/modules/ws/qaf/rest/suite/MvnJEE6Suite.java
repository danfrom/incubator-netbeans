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
package org.netbeans.modules.ws.qaf.rest.suite;

import junit.framework.Test;
import org.netbeans.jellytools.modules.j2ee.J2eeTestCase;
import org.netbeans.modules.ws.qaf.rest.JEE6MvnCRUDTest;
import org.netbeans.modules.ws.qaf.rest.JEE6MvnFromDBTest;
import org.netbeans.modules.ws.qaf.rest.JEE6MvnPatternsTest;

/**
 *
 * @author lukas
 */
public class MvnJEE6Suite extends J2eeTestCase {

    public MvnJEE6Suite(String name) {
        super(name);
    }

    public static Test suite() {
        return addServerTests(Server.GLASSFISH,
                addServerTests(Server.GLASSFISH,
                addServerTests(Server.GLASSFISH, emptyConfiguration(), JEE6MvnFromDBTest.class,
                "testFromDB",
                "testRun",
                "testUndeploy"), JEE6MvnCRUDTest.class,
                "testRfE", //NOI18N
                "testPropAccess", //NOI18N
                "testRun", //NOI18N
                "testCreateRestClient", //NOI18N
                "testUndeploy"), JEE6MvnPatternsTest.class,
                "testSingletonDef", //NOI18N
                "testContainerIDef", //NOI18N
                "testCcContainerIDef", //NOI18N
                "testSingleton1", //NOI18N
                "testCcContainerI1", //NOI18N
                "testSingleton2", //NOI18N
                "testContainerI1", //NOI18N
                "testContainerI2", //NOI18N
                "testSingleton3", //NOI18N
                "testContainerI3", //NOI18N
                "testCcContainerI2", //NOI18N
                "testCcContainerI3", //NOI18N
                "testRun", //NOI18N
                "testUndeploy").enableModules(".*").clusters(".*").suite();
    }
}
