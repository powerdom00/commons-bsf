/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2004 The Apache Software Foundation.  All rights
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

import java.util.Hashtable;
import java.io.*;

/**
 * This class loader knows to load a class from the tempDir dir
 * of the environment of the given manager. 
 * 
 * @author   Sanjiva Weerawarana
 */
class BSFClassLoader extends ClassLoader {
  Hashtable cache = new Hashtable ();
  String tempDir = ".";

  // note the non-public constructor - this is only avail within
  // this package.
  BSFClassLoader () {
  }
  public synchronized Class loadClass (String name, boolean resolve)
											   throws ClassNotFoundException {
	Class c = (Class) cache.get (name);
	if (c == null) {
	  // is it a system class
	  try {
	c = findSystemClass (name);
	cache.put (name, c);
	return c;
	  } catch (ClassNotFoundException e) {
	// nope
	  }
	  try {
	byte[] data = loadClassData (name);
	c = defineClass (name, data, 0, data.length);
	cache.put (name, c); 
	  } catch (Exception e) {
	e.printStackTrace ();
	throw new ClassNotFoundException ("unable to resolve class '" + 
					  name + "'");
	  }
	}
	if (resolve)
	  resolveClass (c); 
	return c;  
  }
  private byte[] loadClassData (String name) throws Exception {
	String fileName = tempDir + File.separatorChar + name + ".class";
	FileInputStream fi = new FileInputStream (fileName);
	byte[] data = new byte[fi.available ()];
	fi.read (data);
	fi.close();
	return data;
  }
  public void setTempDir (String tempDir) {
	this.tempDir = tempDir;
  }
}
