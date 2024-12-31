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


import org.apache.bsf.util.event.generator.ByteUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ByteUtilityTest {

    @Test
    public void testAddBytesArray() {
        byte[] array = {1, 2, 3};
        byte[] value = {4, 5};
        byte[] result = ByteUtility.addBytes(array, value);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testAddBytesByte() {
        byte[] array = {1, 2, 3};
        byte value = 4;
        byte[] result = ByteUtility.addBytes(array, value);
        assertArrayEquals(new byte[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testAddBytesInt() {
        byte[] array = {1, 2, 3};
        int value = 0x010203;
        byte[] result = ByteUtility.addBytes(array, value);
        assertArrayEquals(new byte[]{1, 2, 3, 1, 2, 3}, result);
    }

    @Test
    public void testAddBytesString() {
        byte[] array = {1, 2, 3};
        String value = "test";
        byte[] result = ByteUtility.addBytes(array, value);
        assertArrayEquals(new byte[]{1, 2, 3, 't', 'e', 's', 't'}, result);
    }

    @Test
    public void testAddBytesShort() {
        byte[] array = {1, 2, 3};
        short value = 0x0102;
        byte[] result = ByteUtility.addBytes(array, value);
        assertArrayEquals(new byte[]{1, 2, 3, 1, 2}, result);
    }

    @Test
    public void testByteArrayToDouble() {
        byte[] value = {0, 0, 0, 0, 0, 0, 0, 0};
        double result = ByteUtility.byteArrayToDouble(value);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testByteArrayToFloat() {
        byte[] value = {0, 0, 0, 0};
        float result = ByteUtility.byteArrayToFloat(value);
        assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void testByteArrayToInt() {
        byte[] value = {0, 0, 0, 0};
        int result = ByteUtility.byteArrayToInt(value);
        assertEquals(0, result);
    }

    @Test
    public void testByteArrayToLong() {
        byte[] value = {0, 0, 0, 0, 0, 0, 0, 0};
        long result = ByteUtility.byteArrayToLong(value);
        assertEquals(0L, result);
    }

    @Test
    public void testByteArrayToShort() {
        byte[] value = {0, 0};
        short result = ByteUtility.byteArrayToShort(value);
        assertEquals(0, result);
    }

    @Test
    public void testByteToHexString() {
        byte value = 0x1F;
        String result = ByteUtility.byteToHexString(value);
        assertEquals("1F", result);
    }
}
