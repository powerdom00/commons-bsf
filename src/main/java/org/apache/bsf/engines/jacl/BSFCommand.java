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

package org.apache.bsf.engines.jacl;

import org.apache.bsf.BSFEngine;
import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.apache.bsf.util.EngineUtils;

import tcl.lang.Command;
import tcl.lang.Interp;
import tcl.lang.ReflectObject;
import tcl.lang.TCL;
import tcl.lang.TclException;
import tcl.lang.TclObject;

// class used to add "bsf" command to the Jacl runtime
class BSFCommand implements Command {
    BSFManager mgr;
    BSFEngine jengine;

    BSFCommand(final BSFManager mgr, final BSFEngine jengine) {
        this.mgr = mgr;
        this.jengine = jengine;
    }
    public void checkMinArg(final Interp interp, int arg) throws TclException{
        if (arg < 2) {
            interp.setResult("invalid # of args; usage: bsf " + "lookupBean|registerBean|unregisterBean|addEventListener args");
            throw new TclException(TCL.ERROR);
        }
    }
    public void cmdProc(final Interp interp, final TclObject argv[]) throws TclException {
        checkMinArg(interp,argv.length);
        final String op = argv[1].toString();

        switch (op) {
            case "lookupBean":
                if (argv.length != 3) {
                    interp.setResult("invalid # of args; usage: bsf lookupBean name-of-bean");
                    throw new TclException(TCL.ERROR);
                }

                final String beanName = argv[2].toString();
                final Object bean = mgr.lookupBean(beanName);
                if (bean == null) {
                    interp.setResult("unknown object: " + beanName);
                    throw new TclException(TCL.ERROR);
                }
                interp.setResult(ReflectObject.newInstance(interp, bean.getClass(), bean));
                break;

            case "registerBean":
                if (argv.length != 4) {
                    interp.setResult("invalid # of args; usage: bsf registerBean name-of-bean bean");
                    throw new TclException(TCL.ERROR);
                }
                mgr.registerBean(argv[2].toString(), ReflectObject.get(interp, argv[3]));
                interp.setResult("");
                break;

            case "unregisterBean":
                if (argv.length != 3) {
                    interp.setResult("invalid # of args; usage: bsf unregisterBean name-of-bean");
                    throw new TclException(TCL.ERROR);
                }
                mgr.unregisterBean(argv[2].toString());
                interp.setResult("");
                break;

            case "addEventListener":
                if (argv.length != 6) {
                    interp.setResult("invalid # of args; usage: bsf addEventListener object event-set-name filter script-to-run");
                    throw new TclException(TCL.ERROR);
                }
                try {
                    String filter = argv[4].toString();
                    filter = filter.equals("") ? null : filter;
                    EngineUtils.addEventListener(
                            ReflectObject.get(interp, argv[2]),
                            argv[3].toString(),
                            filter,
                            jengine,
                            mgr,
                            "<event-script>",
                            0,
                            0,
                            argv[5].toString()
                    );
                } catch (final BSFException e) {
                    e.printStackTrace();
                    interp.setResult("got BSF exception: " + e.getMessage());
                    throw new TclException(TCL.ERROR);
                }
                break;
            default:
                throw new TclException(TCL.ERROR);
        }
    }
}
