
                                      Weld

 What is it?
 ============

 Weld is the reference implementation of JSR-299: Java Contents and Dependency
 Injection for the Java EE platform (CDI). JSR-299 is the new Java standard for
 dependency injection and contextual lifecycle management.

 Status
 =======

 This is feature complete release of the CDI specification.

 System requirements
 ===================

 Weld examples require either a Java EE 6 application server, a Java EE 5
 application server retrofitted to include CDI support, a servlet container
 (using the Weld servlet extension) and Java SE (using the Weld Java SE
 extension). In fact, through extensions, Weld can accomodate any Java
 environment.
 
 Currently, you must use JBoss AS 5.2.0.Beta1 (use nightly builds until
 released) or above deploy the provided examples out of the box. Marked
 examples, which do not include EJB session beans, can also be deployed to
 Apache Tomcat 6 or Jetty 6. Other application servers may be supported by
 the examples in the 1.0.0 release.

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
     
 jboss-as/

    Installer for JBoss AS, change into this directory, and run ant update
    There are more details in the reference guide
  
 artifacts/weld

    Weld binary, source and javadoc jars

 artifacts/cdi
   
    CDI API binary, source and javadoc jars

 Licensing
 =========
 
 This distribution, as a whole, is licensed under the terms of the Apache
 License, Version 2.0 (see apl.txt).

 Weld URLs
 =========

 Home Page:       http://seamframework.org/Weld
 Downloads:       http://seamframework.org/Download/SeamDownloads#H-WeldAndJSR299TCKReleases
 Mailing Lists:   https://lists.jboss.org/mailman/listinfo/weld-dev
 Forums:          http://seamframework.org/Community/WeldUsers
 Source Code:     http://anonsvn.jboss.org/repos/weld
 Issue Tracking:  https://jira.jboss.org/jira/browse/WELD (core)
                  https://jira.jboss.org/jira/browse/WELDX (extensions)
                  https://jira.jboss.org/jira/browse/WELDINT (JBoss AS integration)

