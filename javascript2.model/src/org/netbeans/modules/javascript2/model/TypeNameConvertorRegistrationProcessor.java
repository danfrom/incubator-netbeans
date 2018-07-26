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
package org.netbeans.modules.javascript2.model;

import java.util.Set;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import org.openide.filesystems.annotations.LayerGeneratingProcessor;
import org.openide.filesystems.annotations.LayerGenerationException;
import org.openide.util.lookup.ServiceProvider;
import org.netbeans.modules.javascript2.model.spi.TypeNameConvertor;

/**
 *
 * @author Petr Pisl
 */

@ServiceProvider(service=Processor.class)
@SupportedAnnotationTypes("org.netbeans.modules.javascript2.model.spi.TypeNameConvertor.Registration") //NOI18N
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class TypeNameConvertorRegistrationProcessor extends LayerGeneratingProcessor {

    public TypeNameConvertorRegistrationProcessor() {
        super();
    }
    
    @Override
    protected boolean handleProcess(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) throws LayerGenerationException {
        for (Element element : roundEnv.getElementsAnnotatedWith(TypeNameConvertor.Registration.class)) {
            layer(element)
                    .instanceFile(ModelExtender.TYPE_NAME_CONVERTORS_PATH, null, TypeNameConvertor.class)
                    .position(element.getAnnotation(TypeNameConvertor.Registration.class).priority())
                    .write();
        }
        return true;
    }
    
}
