/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugins.jdeprscan;

import java.util.Arrays;

import org.codehaus.plexus.util.cli.Commandline;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractJDeprScanMojoTest {

    /**
     * The forked {@code jdeprscan} JVM must be pinned to an English locale so
     * that {@link org.apache.maven.plugins.jdeprscan.consumers.JDeprScanConsumer}'s
     * English-only patterns can parse the tool's (otherwise localized) findings.
     * See issue #76.
     */
    @Test
    void forcesEnglishLocaleOnForkedJvm() {
        Commandline cmd = new Commandline();
        cmd.setExecutable("jdeprscan");

        AbstractJDeprScanMojo.addFixedLocaleOptions(cmd);

        String args = Arrays.toString(cmd.getArguments());
        assertTrue(args.contains("-J-Duser.language=en"), "should pin language to English, was: " + args);
        assertTrue(args.contains("-J-Duser.country=US"), "should pin country to US, was: " + args);
    }
}
