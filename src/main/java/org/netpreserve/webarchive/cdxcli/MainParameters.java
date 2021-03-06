/*
 * Copyright 2016 The International Internet Preservation Consortium.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.netpreserve.webarchive.cdxcli;

import com.beust.jcommander.Parameter;

/**
 * Declaration of global parameters.
 */
public class MainParameters {
    @Parameter(names = {"-h", "--help"}, description = "print this help message", help = true)
    boolean help;

    @Parameter(names = {"-v", "--version"}, description = "print version and exit", help = true)
    boolean version;

    @Parameter(names = {"-t", "--trace"}, description = "If an error occurs, normal is to orint only the error message."
            + " With this option you will get the complete stack trace.")
    boolean printStacktrace;
}
