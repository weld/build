
                                      Weld

 What is it?
 ============

 Weld is the reference implementation of JSR-299: Java Contents and Dependency
 Injection for the Java EE platform (CDI). JSR-299 is the new Java standard for
 dependency injection and contextual lifecycle management.

 Status
 =======

 This is feature complete implementation of the CDI specification.

 System requirements
 ===================

 Weld examples require either a Java EE 6 application server, a Java EE 5
 application server retrofitted to include CDI support, a servlet container
 (using the Weld servlet extension) and Java SE (using the Weld Java SE
 extension). In fact, through extensions, Weld can accomodate any Java
 environment.
 
 Currently, you must use JBoss AS 6.0 or above to deploy the provided examples
 out of the box. Check http://www.seamframework.org/Weld/Downloads to find the
 correct JBoss AS download for your Weld version. Marked examples, which do not
 include EJB session beans, can also be deployed to Apache Tomcat 6 or Jetty 6.
 Weld examples also work on GlassFish V3, build the artifacts using mvn install
 and deploy.

 JDK 5.0 or JDK 6.0 is required for all Weld releases.

 Contents of distribution
 ========================

 doc/

    API Docs and reference guide. Open doc/en-US/html/index.html in your
    browser for instructions on how to get started using Weld and the
    facilities offered by JSR-299. 
   
 examples/

    The Weld examples, the examples are described in more detail in the 
    reference guide 
     
 artifacts/weld

    Weld binary, source and javadoc jars

 artifacts/cdi
   
    CDI API binary, source and javadoc jars

 Licensing
 =========
 
 This distribution, as a whole, is licensed under the terms of the ASL 2.0, Version 2.0 (see LICENSE.txt).

 The various components in this JAR are each licensed under an open source 
 license that permits you to copy, modify, and distribute the code in both
 binary and source code form. In some cases those licenses impose 
 requirements on you when you redistribute the code. Please refer to the 
 license information contained in the source code of each of the components
 for the specific license applicable to that component.

 Weld URLs
 =========

 Home Page:       http://seamframework.org/Weld
 Downloads:       http://www.seamframework.org/Weld/Downloads 
 Mailing Lists:   https://lists.jboss.org/mailman/listinfo/weld-dev
 Forums:          http://seamframework.org/Community/WeldUsers
 Source Code:     http://github.com/weld
 Issue Tracking:  https://jira.jboss.org/jira/browse/WELD (core)

