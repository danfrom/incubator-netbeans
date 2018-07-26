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
package org.netbeans.modules.websvc.rest.model.impl;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.netbeans.modules.j2ee.dd.spi.MetadataUnit;
import org.netbeans.modules.j2ee.metadata.model.api.MetadataModelAction;
import org.netbeans.modules.j2ee.metadata.model.api.support.annotation.AnnotationModelHelper;
import org.netbeans.modules.websvc.rest.model.api.RestServices;
import org.netbeans.modules.websvc.rest.model.api.RestServicesMetadata;
import org.netbeans.api.java.source.ClasspathInfo;
import org.netbeans.api.project.Project;
import org.netbeans.modules.websvc.rest.model.api.RestServicesModel;

/**
 *
 * @author Peter Liu
 */
public class RestServicesMetadataModelImpl implements RestServicesModel {
    
    private final AnnotationModelHelper helper;
    private final RestServices root;
    private final RestServicesMetadata metadata;
    
    public RestServicesMetadataModelImpl(MetadataUnit metadataUnit, Project project) {
        ClasspathInfo cpi = ClasspathInfo.create(metadataUnit.getBootPath(), metadataUnit.getCompilePath(), metadataUnit.getSourcePath());
        helper = AnnotationModelHelper.create(cpi);
        root = RestServicesImpl.create(helper, project);
        metadata = new RestServicesMetadataImpl(root);
    }
    
    public <R> R runReadAction(final MetadataModelAction<RestServicesMetadata, R> action) throws IOException {
        return helper.runJavaSourceTask(new Callable<R>() {
            public R call() throws Exception {
                return action.run(metadata);
            }
        });
    }
    
    public boolean isReady() {
        return !helper.isJavaScanInProgress();
    }
    
    public <R> Future<R> runReadActionWhenReady(final MetadataModelAction<RestServicesMetadata, R> action) throws IOException {
        return helper.runJavaSourceTaskWhenScanFinished(new Callable<R>() {
            public R call() throws Exception {
                return action.run(metadata);
            }
        });
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        root.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        root.removePropertyChangeListener(pcl);
    }

    public void disablePropertyChangeListener() {
        root.disablePropertyChangeListener();
    }

    public void enablePropertyChangeListener() {
        root.enablePropertyChangeListener();
    }
}
