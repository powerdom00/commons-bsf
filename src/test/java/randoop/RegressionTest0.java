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
package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = org.apache.bsf.BSFException.REASON_IO_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = org.apache.bsf.BSF_Log.DASHES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--------------------------------------------------------" + "'", str0, "--------------------------------------------------------");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.bsf.util.event.EventAdapterRegistry.setDynamic(false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.bsf.util.event.adapters.java_beans_VetoableChangeAdapter java_beans_VetoableChangeAdapter0 = new org.apache.bsf.util.event.adapters.java_beans_VetoableChangeAdapter();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.ClassLoader classLoader0 = null;
        org.apache.bsf.util.event.EventAdapterRegistry.setClassLoader(classLoader0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = org.apache.bsf.util.StringUtils.FILE_NOT_FOUND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "This file was not found: " + "'", str0, "This file was not found: ");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean1 = org.apache.bsf.BSFManager.isLanguageRegistered("This file was not found: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str0 = org.apache.bsf.util.ReflectionUtils.PROPERTYEC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "property '" + "'", str0, "property '");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte byte0 = org.apache.bsf.util.event.generator.Bytecode.C_METHOD_REF;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 10 + "'", byte0 == (byte) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.bsf.util.event.adapters.java_awt_event_FocusAdapter java_awt_event_FocusAdapter0 = new org.apache.bsf.util.event.adapters.java_awt_event_FocusAdapter();
        java.awt.event.FocusEvent focusEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java_awt_event_FocusAdapter0.focusLost(focusEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bsf.util.event.EventProcessor.processEvent(String, Object[])\" because \"this.eventProcessor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.bsf.BSFException bSFException1 = new org.apache.bsf.BSFException("");
        java.lang.Throwable[] throwableArray2 = bSFException1.getSuppressed();
        java.lang.String str3 = bSFException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.bsf.BSFException: " + "'", str3, "org.apache.bsf.BSFException: ");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = org.apache.bsf.BSFException.REASON_UNKNOWN_LANGUAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        boolean boolean1 = org.apache.bsf.util.StringUtils.isValidIdentifierName("property '");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.bsf.util.MethodUtils methodUtils0 = new org.apache.bsf.util.MethodUtils();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.bsf.util.StringUtils.getContentAsString(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray3, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.bsf.util.event.generator.ByteUtility.byteArrayToLong(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String[] strArray6 = new java.lang.String[] { "property '", "", "", "org.apache.bsf.BSFException: " };
        org.apache.bsf.BSFManager.registerScriptingEngine("--------------------------------------------------------", "property '", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "property '", "", "", "org.apache.bsf.BSFException: " });
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte byte0 = org.apache.bsf.util.event.generator.Bytecode.C_INTERFACE_METHOD_REF;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 11 + "'", byte0 == (byte) 11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        boolean boolean1 = org.apache.bsf.util.StringUtils.isValidIdentifierName("--------------------------------------------------------");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.bsf.util.event.adapters.java_awt_event_ContainerAdapter java_awt_event_ContainerAdapter0 = new org.apache.bsf.util.event.adapters.java_awt_event_ContainerAdapter();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray6, byteArray13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.apache.bsf.util.type.TypeConvertorRegistry typeConvertorRegistry17 = new org.apache.bsf.util.type.TypeConvertorRegistry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bsf.util.ReflectionUtils.setProperty((java.lang.Object) 0.0d, "property '", (java.lang.Integer) 100, (java.lang.Object) byteArray14, (java.lang.Class) wildcardClass16, typeConvertorRegistry17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: property 'property '' is unknown for '0.0'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.bsf.util.StringUtils stringUtils0 = new org.apache.bsf.util.StringUtils();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int0 = org.apache.bsf.BSFException.REASON_UNSUPPORTED_FEATURE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 499 + "'", int0 == 499);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String str0 = org.apache.bsf.util.cf.CodeFormatter.DEFAULT_DELIM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "(+" + "'", str0, "(+");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.bsf.util.ReflectionUtils reflectionUtils0 = new org.apache.bsf.util.ReflectionUtils();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("This file was not found: ");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.bsf.util.cf.CodeFormatter codeFormatter0 = new org.apache.bsf.util.cf.CodeFormatter();
        int int1 = codeFormatter0.getMaxLineLength();
        java.lang.String str2 = codeFormatter0.getStickyDelimiters();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.bsf.util.cf.CFDriver cFDriver0 = new org.apache.bsf.util.cf.CFDriver();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.bsf.util.event.EventAdapterImpl eventAdapterImpl0 = new org.apache.bsf.util.event.EventAdapterImpl();
        org.apache.bsf.util.event.EventProcessor eventProcessor1 = null;
        eventAdapterImpl0.setEventProcessor(eventProcessor1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray3, byteArray10);
        byte[] byteArray13 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray11, (long) 100);
        byte[] byteArray15 = org.apache.bsf.util.event.generator.Bytecode.addLong(byteArray13, 0L);
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.bsf.util.event.generator.ByteUtility.byteArrayToLong(byteArray13, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"low\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.ClassLoader classLoader0 = org.apache.bsf.BSFManager.getDefinedClassLoader();
        classLoader0.clearAssertionStatus();
        java.net.URL uRL3 = classLoader0.getResource("");
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(uRL3);
// flaky "1) test33(RegressionTest0)":         org.junit.Assert.assertEquals(uRL3.toString(), "file:/Users/dom/IdeaProjects/commons-bsf/target/classes/");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int int0 = org.apache.bsf.BSFException.REASON_INVALID_ARGUMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray3, byteArray10);
        byte[] byteArray13 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray11, (long) 100);
        short short14 = org.apache.bsf.util.event.generator.ByteUtility.byteArrayToShort(byteArray13);
        short short15 = org.apache.bsf.util.event.generator.ByteUtility.byteArrayToShort(byteArray13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 2570 + "'", short14 == (short) 2570);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 2570 + "'", short15 == (short) 2570);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.ClassLoader classLoader1 = org.apache.bsf.BSFManager.getDefinedClassLoader();
        boolean boolean2 = org.apache.bsf.BSFManager.classLoaderFound(false, classLoader1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bsf.util.Bean bean4 = org.apache.bsf.util.ReflectionUtils.getField((java.lang.Object) classLoader1, "property '");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field 'property '' is unknown for 'jdk.internal.loader.ClassLoaders$AppClassLoader@18769467'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bsf.util.IndentWriter indentWriter2 = new org.apache.bsf.util.IndentWriter(writer0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"writer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100, 10L, (byte) 1 };
        java.lang.Class[] classArray4 = org.apache.bsf.util.EngineUtils.getArgTypes(objArray3);
        java.lang.Class[] classArray5 = org.apache.bsf.util.EngineUtils.getArgTypes(objArray3);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertArrayEquals(classArray4, new java.lang.Class[] { java.lang.Byte.class, java.lang.Long.class, java.lang.Byte.class });
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertArrayEquals(classArray5, new java.lang.Class[] { java.lang.Byte.class, java.lang.Long.class, java.lang.Byte.class });
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.bsf.util.ObjectRegistry objectRegistry0 = null;
        org.apache.bsf.util.ObjectRegistry objectRegistry1 = new org.apache.bsf.util.ObjectRegistry(objectRegistry0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bsf.util.IndentWriter indentWriter2 = new org.apache.bsf.util.IndentWriter(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("org.apache.bsf.BSFException: ");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray3, byteArray10);
        byte[] byteArray13 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray11, (long) 100);
        byte[] byteArray15 = org.apache.bsf.util.event.generator.Bytecode.addUtf8(byteArray13, "(+");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 2, (byte) 40, (byte) 43 });
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        example.ExecJavascript execJavascript0 = new example.ExecJavascript();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, 10L, (byte) 1 };
        java.lang.Class[] classArray5 = org.apache.bsf.util.EngineUtils.getArgTypes(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.bsf.util.EngineUtils.createBean("This file was not found: ", (java.lang.Object[]) classArray5);
            org.junit.Assert.fail("Expected exception of type org.apache.bsf.BSFException; message: [EngineUtils.createBean()]This file was not found: ");
        } catch (org.apache.bsf.BSFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10, 1]");
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertArrayEquals(classArray5, new java.lang.Class[] { java.lang.Byte.class, java.lang.Long.class, java.lang.Byte.class });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.String str1 = org.apache.bsf.BSFManager.findLang("--------------------------------------------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "--------------------------------------------------------" + "'", str1, "--------------------------------------------------------");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.String str1 = org.apache.bsf.util.StringUtils.getValidIdentifierName("(+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "__" + "'", str1, "__");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.bsf.util.IOUtils iOUtils0 = new org.apache.bsf.util.IOUtils();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int int0 = org.apache.bsf.util.cf.CodeFormatter.DEFAULT_MAX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.w3c.dom.Node node0 = null;
        org.apache.bsf.engines.xslt.XSLTResultNode xSLTResultNode1 = new org.apache.bsf.engines.xslt.XSLTResultNode(node0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.bsf.util.cf.CodeFormatter codeFormatter0 = new org.apache.bsf.util.cf.CodeFormatter();
        codeFormatter0.setDelimiters(",");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.bsf.BSFException bSFException1 = new org.apache.bsf.BSFException("This file was not found: ");
        java.lang.Throwable throwable2 = bSFException1.getTargetException();
        org.junit.Assert.assertNull(throwable2);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray3, byteArray10);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray23 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray15, byteArray22);
        byte[] byteArray25 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray23, (long) 100);
        byte[] byteArray27 = org.apache.bsf.util.event.generator.Bytecode.addLong(byteArray25, 0L);
        double double28 = org.apache.bsf.util.event.generator.ByteUtility.byteArrayToDouble(byteArray11, byteArray27);
        byte[] byteArray31 = org.apache.bsf.util.event.generator.Bytecode.addNameAndType(byteArray27, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.233917941214088E17d + "'", double28 == 7.233917941214088E17d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 12, (byte) -1, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray12 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray4, byteArray11);
        byte[] byteArray14 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray12, (long) 100);
        byte[] byteArray16 = org.apache.bsf.util.event.generator.Bytecode.addRef((byte) 1, byteArray12, (short) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.bsf.util.event.adapters.java_awt_event_ActionAdapter java_awt_event_ActionAdapter0 = new org.apache.bsf.util.event.adapters.java_awt_event_ActionAdapter();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.bsf.BSF_Log bSF_Log1 = org.apache.bsf.BSF_LogFactory.getLog("__");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray13 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray5, byteArray12);
        byte[] byteArray15 = org.apache.bsf.util.event.generator.ByteUtility.addBytes(byteArray13, (long) 100);
        byte[] byteArray17 = org.apache.bsf.util.event.generator.Bytecode.addLong(byteArray15, 0L);
        byte[] byteArray20 = org.apache.bsf.util.event.generator.Bytecode.addFieldRef(byteArray15, (short) 2570, (short) 0);
        org.apache.bsf.BSFException bSFException22 = new org.apache.bsf.BSFException("(+");
        bSF_Log1.trace((java.lang.Object) byteArray15, (java.lang.Throwable) bSFException22);
        org.junit.Assert.assertNotNull(bSF_Log1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 9, (byte) 10, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.String str1 = org.apache.bsf.util.StringUtils.cleanString("(+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(+" + "'", str1, "(+");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("This file was not found: ");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.bsf.util.type.TypeConvertorRegistry typeConvertorRegistry0 = new org.apache.bsf.util.type.TypeConvertorRegistry();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.bsf.util.ObjInfo objInfo4 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass2, "property '");
        java.lang.Class class5 = objInfo4.objClass;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.apache.bsf.util.ObjInfo objInfo9 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass7, "property '");
        org.apache.bsf.util.type.TypeConvertor typeConvertor10 = typeConvertorRegistry0.lookup(class5, (java.lang.Class) wildcardClass7);
        org.apache.bsf.util.ObjInfo objInfo12 = new org.apache.bsf.util.ObjInfo(class5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeConvertor10);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.bsf.util.Bean bean2 = null;
        org.apache.bsf.util.type.TypeConvertorRegistry typeConvertorRegistry3 = new org.apache.bsf.util.type.TypeConvertorRegistry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bsf.util.ReflectionUtils.setField((java.lang.Object) "hi!", "hi!", bean2, typeConvertorRegistry3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field 'hi!' is unknown for 'hi!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.bsf.BSFManager bSFManager0 = new org.apache.bsf.BSFManager();
        bSFManager0.terminate();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        bSFManager0.declareBean("--------------------------------------------------------", (java.lang.Object) 20, (java.lang.Class) wildcardClass5);
        java.lang.Object obj8 = bSFManager0.lookupBean("(+");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.bsf.BSFManager bSFManager0 = new org.apache.bsf.BSFManager();
        bSFManager0.terminate();
        java.lang.ClassLoader classLoader2 = bSFManager0.getClassLoader();
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        boolean boolean2 = org.apache.bsf.util.JavaUtils.JDKcompile("__", "(+");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.bsf.util.event.adapters.java_awt_event_MouseMotionAdapter java_awt_event_MouseMotionAdapter0 = new org.apache.bsf.util.event.adapters.java_awt_event_MouseMotionAdapter();
        java.awt.event.MouseEvent mouseEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java_awt_event_MouseMotionAdapter0.mouseMoved(mouseEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.bsf.util.event.EventProcessor.processEvent(String, Object[])\" because \"this.eventProcessor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.bsf.util.type.TypeConvertorRegistry typeConvertorRegistry0 = new org.apache.bsf.util.type.TypeConvertorRegistry();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.bsf.util.ObjInfo objInfo4 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass2, "property '");
        java.lang.Class class5 = objInfo4.objClass;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.apache.bsf.util.ObjInfo objInfo9 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass7, "property '");
        org.apache.bsf.util.type.TypeConvertor typeConvertor10 = typeConvertorRegistry0.lookup(class5, (java.lang.Class) wildcardClass7);
        org.apache.bsf.BSFManager bSFManager11 = new org.apache.bsf.BSFManager();
        org.apache.bsf.Main.checkJavaAwtComponent((java.lang.Object) bSFManager11, "__");
        org.apache.bsf.util.type.TypeConvertorRegistry typeConvertorRegistry16 = new org.apache.bsf.util.type.TypeConvertorRegistry();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.apache.bsf.util.ObjInfo objInfo20 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass18, "property '");
        java.lang.Class class21 = objInfo20.objClass;
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.apache.bsf.util.ObjInfo objInfo25 = new org.apache.bsf.util.ObjInfo((java.lang.Class) wildcardClass23, "property '");
        org.apache.bsf.util.type.TypeConvertor typeConvertor26 = typeConvertorRegistry16.lookup(class21, (java.lang.Class) wildcardClass23);
        bSFManager11.declareBean("property '", (java.lang.Object) (short) -1, class21);
        org.apache.bsf.BSFManager bSFManager28 = new org.apache.bsf.BSFManager();
        bSFManager28.terminate();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        bSFManager28.declareBean("--------------------------------------------------------", (java.lang.Object) 20, (java.lang.Class) wildcardClass33);
        org.apache.bsf.util.type.TypeConvertor typeConvertor35 = typeConvertorRegistry0.lookup(class21, (java.lang.Class) wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeConvertor10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(typeConvertor26);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(typeConvertor35);
    }
}
