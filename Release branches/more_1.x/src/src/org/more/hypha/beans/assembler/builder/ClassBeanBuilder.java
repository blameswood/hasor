/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.more.hypha.beans.assembler.builder;
import org.more.hypha.beans.define.ClassPathBeanDefine;
import org.more.hypha.commons.engine.AbstractBeanBuilderEx;
import org.more.log.ILog;
import org.more.log.LogFactory;
/**
 * 
 * @version 2011-2-15
 * @author ������ (zyc@byshell.org)
 */
public class ClassBeanBuilder extends AbstractBeanBuilderEx<ClassPathBeanDefine> {
    private static ILog log = LogFactory.getLog(ClassBeanBuilder.class);
    /*------------------------------------------------------------------------------*/
    public <O> O createBean(ClassPathBeanDefine define, Object[] params) {
        // TODO Auto-generated method stub
        a
        return null;
    }
    public byte[] loadBytes(ClassPathBeanDefine define, Object[] params) {
        // TODO Auto-generated method stub
        return null;
    }
    public Class<?> loadType(byte[] bytes, ClassPathBeanDefine define, Object[] params) {
        // TODO Auto-generated method stub
        return null;
    }
};