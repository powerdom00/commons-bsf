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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.bsf.BSFManager;
import org.apache.bsf.BSFException;
import example.MathLibrary;
public class ExecJavascriptTest {

    @Test
    void executeSineFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.sinFunction(30); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(0.49999999999999994, result);
    }

    @Test
    void executeCosineFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.cosFunction(60); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(0.5000000000000001, result);
    }

    @Test
    void executeTangentFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.tanFunction(45); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(0.9999999999999999, result);
    }

    @Test
    void executeLogFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.logFunction(Math.E); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(1.0, result);
    }

    @Test
    void executeSqrtFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.sqrtFunction(4); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(2.0, result);
    }

    @Test
    void executePowFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.powFunction(2, 3); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(8.0, result);
    }

    @Test
    void executeAbsFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.absFunction(-5); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(5.0, result);
    }

    @Test
    void executeMaxFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.maxFunction(3, 7); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(7.0, result);
    }

    @Test
    void executeMinFunction() throws BSFException {
        BSFManager bsfManager = new BSFManager();
        bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);
        String script = "var result = math.minFunction(3, 7); result;";
        Object result = bsfManager.eval("javascript", "script", 0, 0, script);
        assertEquals(3.0, result);
    }
}
