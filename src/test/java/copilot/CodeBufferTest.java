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

import org.apache.bsf.util.CodeBuffer;
import org.apache.bsf.util.ObjInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Hashtable;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class CodeBufferTest {

    private CodeBuffer codeBuffer;

    @BeforeEach
    public void setUp() {
        codeBuffer = new CodeBuffer();
    }

    @Test
    public void testAddConstructorArgument() {
        ObjInfo arg = new ObjInfo(String.class, "arg");
        codeBuffer.addConstructorArgument(arg);
        Vector constructorArguments = codeBuffer.getConstructorArguments();
        assertEquals(1, constructorArguments.size());
        assertEquals(arg, constructorArguments.get(0));
    }

    @Test
    public void testAddConstructorException() {
        String exceptionName = "java.io.IOException";
        codeBuffer.addConstructorException(exceptionName);
        Vector constructorExceptions = codeBuffer.getConstructorExceptions();
        assertEquals(1, constructorExceptions.size());
        assertEquals(exceptionName, constructorExceptions.get(0));
    }

    @Test
    public void testAddFieldDeclaration() {
        String fieldDeclaration = "private int field;";
        codeBuffer.addFieldDeclaration(fieldDeclaration);
        StringBuffer fieldBuffer = codeBuffer.getFieldBuffer();
        assertTrue(fieldBuffer.toString().contains(fieldDeclaration));
    }

    @Test
    public void testAddImport() {
        String importName = "java.util.List";
        codeBuffer.addImport(importName);
        Vector imports = codeBuffer.getImports();
        assertEquals(1, imports.size());
        assertEquals(importName, imports.get(0));
    }

    @Test
    public void testBuildNewSymbol() {
        String prefix = "symbol";
        String symbol = codeBuffer.buildNewSymbol(prefix);
        assertEquals("symbol_0", symbol);
    }

    @Test
    public void testClearSymbolTable() {
        codeBuffer.clearSymbolTable();
        Hashtable symbolTable = codeBuffer.getSymbolTable();
        assertTrue(symbolTable.isEmpty());
    }

    @Test
    public void testMerge() {
        CodeBuffer otherBuffer = new CodeBuffer();
        otherBuffer.addFieldDeclaration("private int otherField;");
        codeBuffer.merge(otherBuffer);
        StringBuffer fieldBuffer = codeBuffer.getFieldBuffer();
        assertTrue(fieldBuffer.toString().contains("private int otherField;"));
    }

    @Test
    public void testPrint() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        codeBuffer.setClassName("TestClass");
        codeBuffer.print(pw, false);
        String output = sw.toString();
        assertTrue(output.contains("public class TestClass"));
    }

    //nuovo
    @Test
    public void testAddInitializerStatement() {
        String statement = "int x = 0;";
        codeBuffer.addInitializerStatement(statement);
        StringBuffer initializerBuffer = codeBuffer.getInitializerBuffer();
        assertTrue(initializerBuffer.toString().contains(statement));
    }

    @Test
    public void testAddMethodDeclaration() {
        String methodDeclaration = "public void newMethod() {}";
        codeBuffer.addMethodDeclaration(methodDeclaration);
        StringBuffer methodBuffer = codeBuffer.getMethodBuffer();
        assertTrue(methodBuffer.toString().contains(methodDeclaration));
    }

    @Test
    public void testAddServiceMethodException() {
        String exceptionName = "java.lang.Exception";
        codeBuffer.addServiceMethodException(exceptionName);
        Vector serviceMethodExceptions = codeBuffer.getServiceMethodExceptions();
        assertEquals(1, serviceMethodExceptions.size());
        assertEquals(exceptionName, serviceMethodExceptions.get(0));
    }

    @Test
    public void testAddServiceMethodStatement() {
        String statement = "System.out.println(\"Hello World\");";
        codeBuffer.addServiceMethodStatement(statement);
        StringBuffer serviceMethodBuffer = codeBuffer.getServiceMethodBuffer();
        assertTrue(serviceMethodBuffer.toString().contains(statement));
    }

    @Test
    public void testGetClassName() {
        codeBuffer.setClassName("NewClassName");
        assertEquals("NewClassName", codeBuffer.getClassName());
    }

    @Test
    public void testGetExtends() {
        codeBuffer.setExtends("BaseClass");
        assertEquals("BaseClass", codeBuffer.getExtends());
    }

    @Test
    public void testGetPackageName() {
        codeBuffer.setPackageName("com.example");
        assertEquals("com.example", codeBuffer.getPackageName());
    }

    @Test
    public void testSetServiceMethodReturnType() {
        codeBuffer.setServiceMethodReturnType(String.class);
        assertEquals(String.class, codeBuffer.getServiceMethodReturnType());
    }
}

