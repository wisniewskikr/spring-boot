SPRING BOOT REST API SECURITY X509
==================================


LOCALHOST URL
-------------

* URL: https://localhost:8443/app
* Credentials: Security file ``<app>/src/main/resources/certificates/example509client.jks`` has to be installed on API Client


DESCRIPTION
-----------

This is simple Spring Boot REST API project which displays "Hello World" text in JSON. 
This project is secured by x509 Security. It means that API Client and API Server have to have installed connected security files with certificates.

Security file for Standalone Spring Boot Server is configured in file: ``<app>/src/main/resources/application.properties``

Security file for External Servers has to be configured on these Servers. For instance for Tomcat Server please check section "Tomcat". 
 
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
* https://[server]/app

CERTIFICATE
-----------

To create your own certificate you can use following tool:
* KeyStore Explorer
For x509 files please be aware that:
* Client file: has to have pair of keys (private and public)
* Server file: has to have only certificate (exported from Client file)


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