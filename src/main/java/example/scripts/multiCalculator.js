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

/* A silly little calculator implemented in Javascript (Rhino) using
   Java components for the UI. */

f = new java.awt.Frame ("MultiCalculator");
bsf.addEventListener (f, "window", "windowClosing",
                      "java.lang.System.exit (0);");

var font = new java.awt.Font("Times", java.awt.Font.BOLD, 14);
f1 = new java.awt.TextField (20);
f1.setFont(font);
bsf.addEventListener (f1, "action", null, "doMath ()");
f2 = new java.awt.TextField (20);
f2.setFont(font);
bsf.addEventListener (f2, "text", null, "doMath ()");

//Creating a panel for arithmetic operations on two operands
p = new java.awt.Panel ();
p.setLayout (new java.awt.GridLayout (6, 2));
p.add (new java.awt.Label ("Enter Operand"));
p.add (f1);
p.add (new java.awt.Label ("Enter Operand"));
p.add (f2);
p.add (new java.awt.Label ("Sum"));
p.add (sum = new java.awt.TextField (20))
p.add (new java.awt.Label ("Difference"));
p.add (diff = new java.awt.TextField (20));
p.add (new java.awt.Label ("Product"));
p.add (prod = new java.awt.TextField (20));
p.add (new java.awt.Label ("Quotient"));
p.add (quo = new java.awt.TextField (20));
sum.setEditable(false);
diff.setEditable(false);
prod.setEditable(false);
quo.setEditable(false);
f.add ("North", p);

//Creating a panel for tax calculation
fAmount = new java.awt.TextField (20);
fTRate = new java.awt.TextField (20);
fAmount.setFont(font);
fTRate.setFont(font);

p = new java.awt.Panel ();
p.setLayout (new java.awt.GridLayout (3, 2));
p.add (new java.awt.Label ("Enter Amount"));
p.add (fAmount);
p.add (new java.awt.Label ("Enter Tax Rate"));
p.add (fTRate);
p.add (new java.awt.Label ("Gross"));
p.add (gross = new java.awt.TextField (20))
gross.setEditable(false);
f.add ("Center",p);
bsf.addEventListener (fAmount, "action", null, "tax ()");
fRate = new java.awt.TextField (20);
bsf.addEventListener (fTRate, "text", null, "tax ()");

//Creating a panel for conversion into miles
fKm = new java.awt.TextField (20);
fKm.setFont(font);


p = new java.awt.Panel ();
p.setLayout (new java.awt.GridLayout (2, 2));
p.add (new java.awt.Label ("Enter km"));
p.add (fKm);
p.add (new java.awt.Label ("Miles"));
p.add (miles = new java.awt.TextField (20))
miles.setEditable(false);
f.add ("South",p);
bsf.addEventListener (fKm, "text", null, "convert ()");

f.pack ();
f.show ();
f.toFront ();

function getField (f) {
  t = f.getText ();
  return (t == "") ? 0 : java.lang.Integer.parseInt (t);
}

//Functions to update the fields
function doMath () {
  n1 = getField (f1);
  n2 = getField (f2);
  sum.setText ((n1 + n2) + "");
  diff.setText ((n1 - n2) + "");
  prod.setText ((n1 * n2) + "");
  quo.setText ((n1 / n2) + "");
}
function tax () {
  amount = getField (fAmount);
  tRate = getField (fTRate);
  gross.setText (( ((amount * tRate) / 100) + amount) + "");
}

function convert () {
  km = getField (fKm);
  miles.setText ((km * 0.621371) + "");
}













