/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "Apache BSF", "Apache", and "Apache Software Foundation"
 *    must not be used to endorse or promote products derived from
 *    this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many individuals
 * on behalf of the Apache Software Foundation and was originally created by
 * Sanjiva Weerawarana and others at International Business Machines
 * Corporation. For more information on the Apache Software Foundation,
 * please see <http://www.apache.org/>.
 */

package org.apache.bsf.util;

import java.io.IOException;
import org.apache.bsf.debug.util.DebugLog;

public class JavaUtils
{
    // Temporarily copied from JavaEngine...

    public static boolean JDKcompile(String fileName, String classPath)
    {
        String option = (DebugLog.getLogLevel() > 0) ? "-g" : "-O";
        String args[] = {
            "javac",
            option,
            "-classpath",
            classPath,
            fileName
        };

        DebugLog.stderrPrintln("JavaEngine: Compiling " + fileName, 
                               DebugLog.BSF_LOG_L1);
        DebugLog.stderrPrintln("JavaEngine: Classpath is " + classPath, 
                               DebugLog.BSF_LOG_L1);

        try
        {
            Process p=java.lang.Runtime.getRuntime().exec(args);
            p.waitFor();
            return(p.exitValue()!=0);
        } catch(IOException e) {
            DebugLog.stderrPrintln("ERROR: IO exception during exec(javac).", 
                                   DebugLog.BSF_LOG_L1);
        } catch(SecurityException e) {
            DebugLog.stderrPrintln("ERROR: Unable to create subprocess " +
                                   "to exec(javac).", DebugLog.BSF_LOG_L1);
        } catch(InterruptedException e) {
            DebugLog.stderrPrintln("ERROR: Wait for exec(javac) was " +
                                   "interrupted.", DebugLog.BSF_LOG_L1);
        }
        return false;
    }
}
