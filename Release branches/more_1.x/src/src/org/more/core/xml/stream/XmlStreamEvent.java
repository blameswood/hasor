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
package org.more.core.xml.stream;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamReader;
/**
 * xml�¼����Ļ��ࡣ
 * @version 2010-9-7
 * @author ������ (zyc@byshell.org)
 */
public abstract class XmlStreamEvent {
    private String          xpath  = null; //��ǰ�¼�������xpath
    private XMLStreamReader reader = null; //�ײ��XMLStreamReader
    //-----------------------------------------------------
    public XmlStreamEvent(String xpath, XMLStreamReader reader) {
        this.xpath = xpath;
        this.reader = reader;
    }
    //-----------------------------------------------------
    /**��ȡ��ǰ�¼�������xpath��*/
    public String getXpath() {
        return this.xpath;
    }
    /**��ȡ{@link XMLStreamReader}����*/
    protected XMLStreamReader getReader() {
        return this.reader;
    }
    /**�ṩ�й��¼�λ�õ���Ϣ��Location �ṩ��������Ϣ���ǿ�ѡ�ġ����磬Ӧ�ó������ֻ�����кš�*/
    public Location getLocation() {
        return this.reader.getLocation();
    }
}