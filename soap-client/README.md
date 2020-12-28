SPRING BOOT SOAP CLIENT
=======================


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