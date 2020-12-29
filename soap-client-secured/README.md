SPRING BOOT SOAP CLIENT SECURED
===============================


LOCALHOST URL
-------------

* URL: http://localhost:8081/app/greeting
* Credentials: user / password


DESCRIPTION
-----------

This is simple Spring Boot SOAP Client which displays "Hello World Stranger" text.
Spring Boot SOAP Server is secured so this client has to use credentials.
Credentials are defined in file "application.properties".  

**NOTE** 
Please be aware that this Client **works only together with Spring Boot SOAP Server Secured**. Ports:
* SOAP Server Secured application: Server should work on port 8080
* SOAP Client Secured applications: Client should work on port 8081 

Used technologies:
* BE: Spring Boot Web Services
* FE: JSON


IMPLEMENTATION
--------------

Implementation details:
* Use application SOAP Client as the base;
* In file "pom.xml" add dependency "spring-ws-security";
* In file "application.properties" add SOAP credentials properties;
* In class WsConfig add method securityInterceptor(). Use this Bean in another method greetingWsClient();


LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* http://[server]/app/greeting