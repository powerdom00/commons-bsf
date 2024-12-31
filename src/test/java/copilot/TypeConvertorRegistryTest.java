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

import org.apache.bsf.util.type.TypeConvertor;
import org.apache.bsf.util.type.TypeConvertorRegistry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.awt.Font;

import static org.junit.jupiter.api.Assertions.*;

public class TypeConvertorRegistryTest {

    private TypeConvertorRegistry registry;

    @BeforeEach
    public void setUp() {
        registry = new TypeConvertorRegistry();
    }

    @Test
    public void testLookupPrimitiveWrapperConvertor() {
        TypeConvertor convertor = registry.lookup(Boolean.class, boolean.class);
        assertNotNull(convertor);
        assertEquals(Boolean.TRUE, convertor.convert(Boolean.class, boolean.class, Boolean.TRUE));
    }

    @Test
    public void testLookupObjectToStringConvertor() {
        TypeConvertor convertor = registry.lookup(Object.class, String.class);
        assertNotNull(convertor);
        assertEquals("test", convertor.convert(Object.class, String.class, "test"));
    }

    @Test
    public void testLookupStringToPrimitiveConvertor() {
        TypeConvertor convertor = registry.lookup(String.class, int.class);
        assertNotNull(convertor);
        assertEquals(123, convertor.convert(String.class, int.class, "123"));
    }

    @Test
    public void testLookupStringToFontConvertor() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        assertNotNull(convertor);
        assertEquals(Font.decode("Arial"), convertor.convert(String.class, Font.class, "Arial"));
    }

    @Test
    public void testLookupStringToColorConvertor() {
        TypeConvertor convertor = registry.lookup(String.class, Color.class);
        assertNotNull(convertor);
        assertEquals(Color.decode("#FFFFFF"), convertor.convert(String.class, Color.class, "#FFFFFF"));
    }

    @Test
    public void testRegisterAndLookupCustomConvertor() {
        TypeConvertor customConvertor = new TypeConvertor() {
            public Object convert(Class from, Class to, Object obj) {
                return "custom";
            }

            public String getCodeGenString() {
                return "(Class from, Class to, Object obj) {\n" + "return \"custom\";\n" + "}";
            }
        };
        registry.register(String.class, Object.class, customConvertor);
        TypeConvertor lookupConvertor = registry.lookup(String.class, Object.class);
        assertNotNull(lookupConvertor);
        assertEquals("custom", lookupConvertor.convert(String.class, Object.class, "test"));
    }
}