CDI TCK
------------

Contexts and Dependency Injection (CDI) for Java 2.0 (JSR-365) is a Java standard for
dependency injection and contextual lifecycle management. This is the TCK for CDI.

This distribution, as a whole, is licensed under the terms of the Apache Public
License (see apl.txt).

Documentation can be found at
http://docs.jboss.org/cdi/tck/reference/latest/

The list of all released versions can be found at
https://issues.jboss.org/browse/CDITCK#selectedTab=com.atlassian.jira.plugin.system.project%3Aversions-panel

This distribution consists of:

artifacts/
   -- TCK binaries and sources, packaged as jars
   -- specification audit (source and report)
   -- TestNG suite.xml file for running the TCK (probably outdated)

doc/
   -- reference guide for the current version of TCK

lib/
   -- Maven project to get all TCK dependencies

weld/
   -- TCK runner for using Weld (the CDI RI) with JBoss AS

   jboss-tck-runner/
      -- maven-based TCK runner for WildFly 10

   porting-package-lib/
      -- Maven project to get all Weld Porting Package dependencies

