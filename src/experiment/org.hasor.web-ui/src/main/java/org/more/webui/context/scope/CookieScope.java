/*
 * Copyright 2008-2009 the original ������(zyc@hasor.net).
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
package org.more.webui.context.scope;
import java.util.HashMap;
import javax.servlet.http.Cookie;
import org.more.webui.context.ViewContext;
/**
 * �����ṩCookie������Ķ�ȡ����֧��ɾ���޸Ĳ�����
 * @version 2009-12-28
 * @author ������ (zyc@byshell.org)
 */
public class CookieScope extends HashMap<String, Object> {
    private static final long serialVersionUID = -3056532859705478664L;
    public CookieScope(ViewContext viewContext) {
        Cookie[] cookies = viewContext.getHttpRequest().getCookies();
        if (cookies != null)
            for (Cookie cookie : cookies)
                super.put(cookie.getName(), cookie.getValue());
    }
    @Override
    public Object get(Object key) {
        return super.get(key);
    }
    @Override
    public Object put(String key, Object value) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Object remove(Object key) {
        throw new UnsupportedOperationException();
    }
};