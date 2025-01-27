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
package example;

public class MathLibrary {
    // Function to calculate the sine of an angle in degrees
    public double sinFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Convert degrees to radians
        return Math.sin(radians);  // Calculate sine
    }

    // Function to calculate the cosine of an angle in degrees
    public double cosFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Convert degrees to radians
        return Math.cos(radians);  // Calculate cosine
    }

    // Function to calculate the tangent of an angle in degrees
    public double tanFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Convert degrees to radians
        return Math.tan(radians);  // Calculate tangent
    }

    // Function to calculate the exponential (e^x) of a number
    public double expFunction(double x) {
        return Math.exp(x);  // Calculate e raised to the power of x
    }

    // Function to calculate the natural logarithm (ln) of a number
    public double logFunction(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is defined only for positive numbers.");
        }
        return Math.log(x);  // Calculate the natural logarithm of x
    }

    // Function to calculate the square root of a number
    public double sqrtFunction(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        return Math.sqrt(x);  // Calculate the square root of x
    }

    // Function to calculate the power (x^y) of a number
    public double powFunction(double base, double exponent) {
        return Math.pow(base, exponent);  // Calculate base raised to the power of exponent
    }

    // Function to calculate the absolute value of a number
    public double absFunction(double x) {
        return Math.abs(x);  // Return the absolute value of x
    }

    // Function to find the maximum value between two numbers
    public double maxFunction(double a, double b) {
        return Math.max(a, b);  // Return the maximum of a and b
    }

    // Function to find the minimum value between two numbers
    public double minFunction(double a, double b) {
        return Math.min(a, b);  // Return the minimum of a and b
    }
}
