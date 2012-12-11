/**
 * Project: antx-agent
 * 
 * File Created at Nov 5, 2012
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.mpfive.util.antx;

import java.lang.instrument.Instrumentation;

/**
 * <pre>
 * http://docs.oracle.com/javase/6/docs/api/java/lang/instrument/package-summary.html
 * </pre>
 * 
 * @author wanghui.tar.gz@gmail.com
 */
public class AntxAgent {

    /**
     * 
     */
    public static void premain(String args, Instrumentation inst) {
        if (args != null) {
            String[] paths = args.split(":");
            for (String path : paths) {
                com.alibaba.antx.config.cli.Main.main(new String[] { path });
            }
        }
    }
}
