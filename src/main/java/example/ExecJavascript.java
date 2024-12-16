package example;/*
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

import org.apache.bsf.BSFManager;
import org.apache.bsf.BSFException;
import java.util.Scanner;

public class ExecJavascript {
    public static void main(String[] args) {
        // Initialize BSFManager to execute JavaScript
        BSFManager bsfManager = new BSFManager();
        Scanner scanner = new Scanner(System.in);

        try {
            // Register the MathLibrary class as a JavaScript object
            bsfManager.declareBean("math", new MathLibrary(), MathLibrary.class);

            while (true) {
                // Print the menu
                System.out.println("Select a mathematical function:");
                System.out.println("1. Sine (sin)");
                System.out.println("2. Cosine (cos)");
                System.out.println("3. Tangent (tan)");
                System.out.println("4. Exponential (exp)");
                System.out.println("5. Natural Logarithm (ln)");
                System.out.println("6. Square Root (sqrt)");
                System.out.println("7. Power (pow)");
                System.out.println("8. Absolute Value (abs)");
                System.out.println("9. Maximum (max)");
                System.out.println("10. Minimum (min)");
                System.out.println("0. Exit");

                // Read user choice
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting the program...");
                    break;  // Exit the program
                }

                // Variables for function parameters
                double num1, num2;
                String script = "";

                switch (choice) {
                    case 1:  // Sine
                        System.out.print("Enter the angle in degrees for sine: ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.sinFunction(" + num1 + "); " +
                                 "result;";
                        break;
                    case 2:  // Cosine
                        System.out.print("Enter the angle in degrees for cosine: ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.cosFunction(" + num1 + "); "+
                                 "result;";
                        break;
                    case 3:  // Tangent
                        System.out.print("Enter the angle in degrees for tangent: ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.tanFunction(" + num1 + "); "+
                                "result;";
                        break;
                    case 4:  // Exponential
                        System.out.print("Enter the number for exponential (e^x): ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.expFunction(" + num1 + "); "+
                                "result;";
                        break;
                    case 5:  // Natural Logarithm
                        System.out.print("Enter the number for natural logarithm (ln): ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.logFunction(" + num1 + "); "+
                                "result;";
                        break;
                    case 6:  // Square Root
                        System.out.print("Enter the number for square root: ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.sqrtFunction(" + num1 + "); "+
                                "result;";
                        break;
                    case 7:  // Power
                        System.out.print("Enter the base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the exponent: ");
                        num2 = scanner.nextDouble();
                        script = "var result = math.powFunction(" + num1 + ", " + num2 + "); "+
                                "result;";
                        break;
                    case 8:  // Absolute Value
                        System.out.print("Enter the number for absolute value: ");
                        num1 = scanner.nextDouble();
                        script = "var result = math.absFunction(" + num1 + "); "+
                                "result;";
                        break;
                    case 9:  // Maximum
                        System.out.print("Enter the first number for maximum: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number for maximum: ");
                        num2 = scanner.nextDouble();
                        script = "var result = math.maxFunction(" + num1 + ", " + num2 + "); "+
                                "result;";
                        break;
                    case 10:  // Minimum
                        System.out.print("Enter the first number for minimum: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number for minimum: ");
                        num2 = scanner.nextDouble();
                        script = "var result = math.minFunction(" + num1 + ", " + num2 + "); "+
                                "result;";
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                        continue;  // Return to the menu
                }

                // Execute the script
                Object result = bsfManager.eval("javascript", "script", 0, 0, script);

                // Print the result
                System.out.println("Result: " + result);
            }

        } catch (BSFException e) {
            e.printStackTrace();
        } finally {
            scanner.close();  // Close the scanner
        }
    }
}