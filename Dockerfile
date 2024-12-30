#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This simple example app transforms the MathLibrary Java class into a JavaScript object.
# The object is then used by simple JavaScript scripts to perform the required operations.
# The class allows you to perform mathematical functions such as sine and cosine.
# To create the jar file run the maven package command.
# Warning the container must be started in interactive mode.
# Command to run the build: docker build -t bsf-docker.jar .
# Command to run the container: docker run -it -p 8080:8080 bsf-docker.jar

# Use the OpenJDK 17 base image
FROM openjdk:17

# Add the JAR file of the application
ADD target/bsf-docker.jar bsf-docker.jar

# Add the rhino library
ADD lib/rhino-1.7.14.jar rhino-1.7.14.jar

# Set the entry point to run the application with the necessary libraries
ENTRYPOINT ["java", "-cp", "bsf-docker.jar:rhino-1.7.14.jar", "example.ExecJavascript"]

# Expose port 8080 (if your service uses this port for communication)
EXPOSE 8080


