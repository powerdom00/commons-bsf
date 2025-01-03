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

import org.apache.bsf.BSFException;
import org.apache.bsf.BSF_Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BSFLogTest {

    private BSF_Log log;

    @BeforeEach
    public void setUp() {
        log = new BSF_Log("TestLogger");
    }

    @Test
    public void testError() throws BSFException {
        log.error("Error message");
        assertTrue(log.isErrorEnabled());
    }

    @Test
    public void testFatal() throws BSFException {
        log.fatal("Fatal message");
        assertTrue(log.isFatalEnabled());
    }

    @Test
    public void testInfo() throws BSFException {
        log.info("Info message");
        assertTrue(log.isInfoEnabled());
    }

    @Test
    public void testWarn() throws BSFException {
        log.warn("Warn message");
        assertTrue(log.isWarnEnabled());
    }

    @Test
    public void testIsDebugEnabled() throws BSFException {
        assertFalse(log.isDebugEnabled());
    }

    @Test
    public void testIsErrorEnabled() throws BSFException {
        assertTrue(log.isErrorEnabled());
    }

    @Test
    public void testIsFatalEnabled() throws BSFException {
        assertTrue(log.isFatalEnabled());
    }

    @Test
    public void testIsInfoEnabled() throws BSFException {
        assertTrue(log.isInfoEnabled());
    }

    @Test
    public void testIsTraceEnabled() throws BSFException {
        assertFalse(log.isTraceEnabled());
    }

    @Test
    public void testIsWarnEnabled() throws BSFException {
        assertTrue(log.isWarnEnabled());
    }
}
