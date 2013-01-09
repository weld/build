CDI TCK
------------

Contexts and Dependency Injection (CDI) for Java EE (JSR-299, JSR-346) is a Java standard for
dependency injection and contextual lifecycle management. This is the TCK for CDI.

This distribution, as a whole, is licensed under the terms of the Apache Public
License (see apl.txt).

Documentation can be found at
http://seamframework.org/Weld/WeldDevelopmentOverview

This distribution consists of:

artifacts/
   -- TCK binaries and sources, packaged as jars
   -- specification audit (source and report)
   -- TestNG suite.xml file for running the TCK (outdated)

doc/
   -- reference guide for the TCK (outdated)

lib/
   -- Maven project to get all TCK dependencies

weld/
   -- TCK runner for using Weld (the CDI RI) with JBoss AS

   jboss-tck-runner/
      -- maven-based TCK runner for JBoss AS 7

   porting-package-lib/
      -- Maven project to get all Weld Porting Package dependencies
   
