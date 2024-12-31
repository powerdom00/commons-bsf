/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package copilot;

import org.apache.bsf.BSFEngine;
import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.apache.bsf.util.EngineUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EngineUtilsTest {

    private BSFManager manager;
    private BSFEngine engine;
    private TestSource bean;
    private String eventSetName;
    private String filter;
    private String source;
    private int lineNo;
    private int columnNo;
    private Object script;
    private Object dataFromScriptingEngine;

    @BeforeEach
    public void setUp() {
        manager = new BSFManager();
        bean = new TestSource();
        eventSetName = "propertyChange";
        filter = "filter";
        source = "source";
        lineNo = 1;
        columnNo = 1;
        script = new Object();
        dataFromScriptingEngine = new Object();
    }

    @Test
    public void testAddEventListener() {
        assertDoesNotThrow(() -> EngineUtils.addEventListener(bean, eventSetName, filter, engine, manager, source, lineNo, columnNo, script));
    }


    @Test
    public void testAddEventListenerReturningEventInfos() {
        assertDoesNotThrow(() -> EngineUtils.addEventListenerReturningEventInfos(bean, eventSetName, filter, engine, manager, source, lineNo, columnNo, script, dataFromScriptingEngine));
    }

    @Test
    public void testCallBeanMethod() {
        Object[] args = new Object[]{};
        assertThrows(BSFException.class, () -> EngineUtils.callBeanMethod(bean, "nonExistentMethod", args));
    }

    @Test
    public void testCreateBean() {
        Object[] args = new Object[]{};
        assertThrows(BSFException.class, () -> EngineUtils.createBean("NonExistentClass", args));
    }

    @Test
    public void testGetTypeSignatureString() {
        assertEquals("I", EngineUtils.getTypeSignatureString(int.class));
        assertEquals("Ljava/lang/String;", EngineUtils.getTypeSignatureString(String.class));
    }

    @Test
    public void testLoadClass() {
        assertThrows(BSFException.class, () -> EngineUtils.loadClass(manager, "NonExistentClass"));
    }

    @Test
    public void testReplacePlaceholder() {
        String script = "This is a placeholder: ${placeholder}";
        String classname = "ClassName";
        String placeholder = "${placeholder}";
        String result = EngineUtils.replacePlaceholder(script, classname, placeholder);
        assertEquals("This is a placeholder: ClassName", result);
    }
}
