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
package jmh;

import org.apache.bsf.util.type.TypeConvertor;
import org.apache.bsf.util.type.TypeConvertorRegistry;
import org.openjdk.jmh.annotations.*;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.TimeUnit;

@Fork(1)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 2)
@Measurement(iterations = 2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread) // Each thread has its own state
public class TypeConvertorRegistryBenchmarkTest {

    private TypeConvertorRegistry registry;

    @Setup(Level.Iteration) //Executed once per iteration
    public void setup() {
        registry = new TypeConvertorRegistry();
    }
    @Benchmark
    public void testLookupPrimitiveToWrapper() {
        registry.lookup(int.class, Integer.class);
    }

    @Benchmark
    public void testConvertPrimitiveToWrapper() {
        TypeConvertor convertor = registry.lookup(int.class, Integer.class);
        convertor.convert(int.class, Integer.class, 42);
    }

    @Benchmark
    public void testLookupWrapperToPrimitive() {
        registry.lookup(Integer.class, int.class);
    }

    @Benchmark
    public void testConvertWrapperToPrimitive() {
        TypeConvertor convertor = registry.lookup(Integer.class, int.class);
        convertor.convert(Integer.class, int.class, Integer.valueOf(42));
    }

    @Benchmark
    public void testLookupStringToPrimitive() {
        registry.lookup(String.class, int.class);
    }

    @Benchmark
    public void testConvertStringToPrimitive() {
        TypeConvertor convertor = registry.lookup(String.class, int.class);
        convertor.convert(String.class, int.class, "42");
    }

    @Benchmark
    public void testLookupStringToWrapper() {
        registry.lookup(String.class, Integer.class);
    }

    @Benchmark
    public void testConvertStringToWrapper() {
        TypeConvertor convertor = registry.lookup(String.class, Integer.class);
        convertor.convert(String.class, Integer.class, "42");
    }

    @Benchmark
    public void testConvertStringToWrapperBig() {
        TypeConvertor convertor = registry.lookup(String.class, Integer.class);
        convertor.convert(String.class, Integer.class, "4298769876979986");
    }

    @Benchmark
    public void testLookupStringToFont() {
        registry.lookup(String.class, Font.class);
    }

    @Benchmark
    public void testConvertStringToFontArial() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Arial-PLAIN-12");
    }

    @Benchmark
    public void testConvertStringToFontSerif() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Serif-BOLD-18");
    }

    @Benchmark
    public void testConvertStringToFontSansSerif() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "SansSerif-ITALIC-14");
    }

    @Benchmark
    public void testConvertStringToFontCourierNew() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "CourierNew-PLAIN-16");
    }

    @Benchmark
    public void testConvertStringToFontTahoma() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Tahoma-BOLD-20");
    }

    @Benchmark
    public void testConvertStringToFontVerdana() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Verdana-ITALIC-18");
    }

    @Benchmark
    public void testConvertStringToFontTimesNewRoman() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "TimesNewRoman-PLAIN-22");
    }

    @Benchmark
    public void testConvertStringToFontMonospaced() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Monospaced-BOLD-16");
    }

    @Benchmark
    public void testConvertStringToFontGeorgia() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Georgia-ITALIC-14");
    }

    @Benchmark
    public void testConvertStringToFontImpact() {
        TypeConvertor convertor = registry.lookup(String.class, Font.class);
        convertor.convert(String.class, Font.class, "Impact-PLAIN-24");
    }

    @Benchmark
    public void testLookupStringToColor() {
        registry.lookup(String.class, Color.class);
    }

    @Benchmark
    public void testConvertStringToColor() {
        TypeConvertor convertor = registry.lookup(String.class, Color.class);
        convertor.convert(String.class, Color.class, "#FF5733");
    }

    @Benchmark
    public void testConvertPrimitiveToWrapperBig() {
        TypeConvertor convertor = registry.lookup(int.class, Integer.class);
        convertor.convert(int.class, Integer.class, 2147483644);
    }

    @Benchmark
    public void testConvertWrapperToPrimitiveBig() {
        TypeConvertor convertor = registry.lookup(Integer.class, int.class);
        convertor.convert(Integer.class, int.class, Integer.valueOf(2147483644));
    }

    @Benchmark
    public void testConvertStringToPrimitiveBig() {
        TypeConvertor convertor = registry.lookup(String.class, int.class);
        convertor.convert(String.class, int.class, "2147483644");
    }

    @Benchmark
    public void testConvertStringToWrapperBig() {
        TypeConvertor convertor = registry.lookup(String.class, Integer.class);
        convertor.convert(String.class, Integer.class, "2147483644");
    }
}

