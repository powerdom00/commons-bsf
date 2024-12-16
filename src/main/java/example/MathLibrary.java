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
    // Funzione per calcolare il seno di un angolo in gradi
    public double sinFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Converte i gradi in radianti
        return Math.sin(radians);  // Calcola il seno
    }

    // Funzione per calcolare il coseno di un angolo in gradi
    public double cosFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Converte i gradi in radianti
        return Math.cos(radians);  // Calcola il coseno
    }

    // Funzione per calcolare la tangente di un angolo in gradi
    public double tanFunction(double degrees) {
        double radians = Math.toRadians(degrees);  // Converte i gradi in radianti
        return Math.tan(radians);  // Calcola la tangente
    }

    // Funzione per calcolare l'esponenziale (e^x) di un numero
    public double expFunction(double x) {
        return Math.exp(x);  // Calcola e elevato a x
    }

    // Funzione per calcolare il logaritmo naturale (ln) di un numero
    public double logFunction(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Il logaritmo naturale è definito solo per numeri positivi.");
        }
        return Math.log(x);  // Calcola il logaritmo naturale di x
    }

    // Funzione per calcolare la radice quadrata di un numero
    public double sqrtFunction(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("La radice quadrata non è definita per numeri negativi.");
        }
        return Math.sqrt(x);  // Calcola la radice quadrata di x
    }

    // Funzione per calcolare la potenza (x^y) di un numero
    public double powFunction(double base, double exponent) {
        return Math.pow(base, exponent);  // Calcola base elevato alla potenza exponent
    }

    // Funzione per calcolare il valore assoluto di un numero
    public double absFunction(double x) {
        return Math.abs(x);  // Restituisce il valore assoluto di x
    }

    // Funzione per calcolare il valore massimo tra due numeri
    public double maxFunction(double a, double b) {
        return Math.max(a, b);  // Restituisce il massimo tra a e b
    }

    // Funzione per calcolare il valore minimo tra due numeri
    public double minFunction(double a, double b) {
        return Math.min(a, b);  // Restituisce il minimo tra a e b
    }
}
