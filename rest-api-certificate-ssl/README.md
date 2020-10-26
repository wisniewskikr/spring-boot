SPRING BOOT REST API WITH SSL CERTIFICATE
=========================================


LOCALHOST URL
-------------

https://localhost:8443/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot REST API project which displays "Hello World" text in JSON.
Additionally application is secured by SSL certificate (HTTPS). 

Certificate for Standalone Spring Boot Server is configured in file: ``<app>/src/main/resources/application.properties``

Certificate for External Servers has to be configured on these Servers. For instance for Tomcat Server please check section "Tomcat".
 
Used technologies:
* BE: Spring Boot REST API
  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* https://[server]/app/greeting


CERTIFICATE
-----------

To create your own certificate you can use following tool:
* KeyStore Explorer


TOMCAT
------

To configure ssl in Tomcat you have to:
* copy file "example.jks" from location ``<app>/src/main/resources/certificates`` to location: ``<tomcat_home>/conf``
* make following changes in file ``<tomcat_home>/conf/server.xml``:

```              
<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
               clientAuth="false" sslProtocol="TLS" 
			   keystoreFile="${catalina.home}/conf/example.jks"			   
			   keystorePass="password"/>
```   