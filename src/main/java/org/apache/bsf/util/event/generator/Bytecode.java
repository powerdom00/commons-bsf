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

package org.apache.bsf.util.event.generator;

/**
 * Bytecode handling utilities
 *
 * Handle standard byte arrays as defined in Java VM and Class File
 *
 * 5 April 1999 - functions to append Class File byte subarrays into a Class File byte array
 */
public class Bytecode {
    // Constant Pool Item Codes
    public static final byte C_UTF8 = 0x01; // 1
    public static final byte C_INTEGER = 0x03; // 3
    public static final byte C_FLOAT = 0x04; // 4
    public static final byte C_LONG = 0x05; // 5
    public static final byte C_DOUBLE = 0x06; // 6
    public static final byte C_CLASS = 0x07; // 7
    public static final byte C_STRING = 0x08; // 8
    public static final byte C_FIELD_REF = 0x09; // 9
    public static final byte C_METHOD_REF = 0x0A; // 10
    public static final byte C_INTERFACE_METHOD_REF = 0x0B; // 11
    public static final byte C_NAME_AND_TYPE = 0x0C; // 12

//public static byte[] addDouble(byte[] array,double value)
//{
//  array = ByteUtility.addBytes(array,C_Double);
//  array = ByteUtility.addBytes(array,value);
//  return array;
//}

    public static byte[] addClass(final byte[] array, final short value) {
        return addRef(C_CLASS, array, value);
    }

    public static byte[] addFieldRef(final byte[] array, final short value1, final short value2) {
        return addRef(C_FIELD_REF, array, value1, value2);
    }

    public static byte[] addInteger(byte[] array, final int value) {
        array = ByteUtility.addBytes(array, C_INTEGER);
        array = ByteUtility.addBytes(array, value);
        return array;
    }

    public static byte[] addInterfaceMethodRef(final byte[] array, final short value1, final short value2) {
        return addRef(C_INTERFACE_METHOD_REF, array, value1, value2);
    }
//public static byte[] addFloat(byte[] array,float value)
//{
//  array = ByteUtility.addBytes(array,C_Float);
//  array = ByteUtility.addBytes(array,value);
//  return array;
//}

    public static byte[] addLong(byte[] array, final long value) {
        array = ByteUtility.addBytes(array, C_LONG);
        array = ByteUtility.addBytes(array, value);
        return array;
    }

    public static byte[] addMethodRef(final byte[] array, final short value1, final short value2) {
        return addRef(C_METHOD_REF, array, value1, value2);
    }

    public static byte[] addNameAndType(final byte[] array, final short value1, final short value2) {
        return addRef(C_NAME_AND_TYPE, array, value1, value2);
    }

    public static byte[] addRef(final byte refType, byte[] array, final short value) {
        array = ByteUtility.addBytes(array, refType);
        array = ByteUtility.addBytes(array, value);
        return array;
    }

    // Generic Bytecode Methods
    public static byte[] addRef(final byte refType, byte[] array, final short value1, final short value2) {
        array = ByteUtility.addBytes(array, refType);
        array = ByteUtility.addBytes(array, value1);
        array = ByteUtility.addBytes(array, value2);
        return array;
    }

    public static byte[] addString(final byte[] array, final short value) {
        return addRef(C_STRING, array, value);
    }

    // Constant Pool Item Methods
    public static byte[] addUtf8(byte[] array, final String value) {
        array = ByteUtility.addBytes(array, C_UTF8);
        array = ByteUtility.addBytes(array, (short) value.length());
        array = ByteUtility.addBytes(array, value);
        return array;
    }
}
