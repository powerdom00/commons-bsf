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
import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class ExecJavascript {
    public static void main(String[] args) {
        // Set example script path
        String jsScriptFile = "src/main/java/example/scripts/multiCalculator.js";
        try {
            // Reading the script content
            String jsScript = new String(Files.readAllBytes(Paths.get(jsScriptFile)));

            // Create BSFManager object
            BSFManager bsfManager = new BSFManager();

            // Set language
            String language = "javascript";

            // Execute the script with bsfManager
            bsfManager.exec(language, "<stdin>", 0, 0, jsScript);

        } catch (IOException|BSFException e) {
            e.printStackTrace();
        }
    }
}