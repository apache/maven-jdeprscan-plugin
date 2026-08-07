---
title: Introduction
author: 
  - Robert Scholte
date: 2017-11-05
---

<!--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

# Apache Maven JDeprScan Plugin
The Maven JDeprScan plugin is used to scan class files for uses of deprecated API elements.

NOTE: This is an alpha release which means everything can change until we reach the first milestone release.

## Goals Overview

The JDeprScan Plugin has four goals:

- [jdeprscan:jdeprscan](./jdeprscan-mojo.html) scans the main sources for deprecated APIs.
- [jdeprscan:test-jdeprscan](./test-jdeprscan-mojo.html) scans the test sources for deprecated APIs.
- [jdeprscan:list](./list-mojo.html) Prints the set of deprecated APIs. No scanning is done, so no directory, jar, or class arguments should be provided.
- [jdeprscan:help](./help-mojo.html) displays help information on maven-jdeprscan-plugin.
## Usage

General instructions on how to use the JDeprScan Plugin can be found on the [usage page](./usage.html). Some more specific use cases are described in the examples given below.

In case you still have questions regarding the plugin's usage, please have a look at the [FAQ](./faq.html) and feel free to contact the [user mailing list](./mailing-lists.html). The posts to the mailing list are archived and could already contain the answer to your question as part of an older thread. Hence, it is also worth browsing/searching the [mail archive](./mailing-lists.html).

If you feel like the plugin is missing a feature or has a defect, you can fill a feature request or bug report in our [issue tracker](./issue-management.html). When creating a new issue, please provide a comprehensive description of your concern. Especially for fixing bugs it is crucial that the developers can reproduce your problem. For this reason, entire debug logs, POMs or most preferably little demo projects attached to the issue are very much appreciated. Of course, patches are welcome, too. Contributors can check out the project from our [source repository](./scm.html) and will find supplementary information in the [guide to helping with Maven](http://maven.apache.org/guides/development/guide-helping.html).

## Examples

To provide you with better understanding on some usages of the Maven JDeprScan Plugin, you can take a look into the following examples:

TODO: Add examples.
