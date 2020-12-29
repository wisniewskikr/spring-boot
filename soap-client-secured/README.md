SPRING BOOT SOAP CLIENT SECURED
===============================


LOCALHOST URL
-------------

* URL: http://localhost:8081/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot SOAP Client which displays "Hello World Stranger" text. 

**NOTE** 
Please be aware that this Client **works only together with Spring Boot SOAP Server**. Ports:
* SOAP Server application: Server should work on port 8080
* SOAP Client applications: Client should work on port 8081 

Used technologies:
* BE: Spring Boot Web Services
* FE: JSON


IMPLEMENTATION
--------------

Implementation details:
* Put file *.wsdl of SOAP Server (for instance "greeting.wsdl") in location: src/main/resources;
* In file "pom.xml" add plugin "maven-jaxb2-plugin". This plugin will automatically generate SOAP classes basing on file *.wsdl;
* Create class WsConfing. This class includes all configuration for Web Service SOAP;
* Create class GreetingWsClient. This class is endpoint to Web Service SOAP Greeting;
* Inject and use class GreetingWSClient in controller. For instance in class GreetingController;
* In file "application.properties" change port to 8081. At this moment you can run SOAP Client and Server on the same computer;
* In file "application.properties" add URI to SOAP Server.
  

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