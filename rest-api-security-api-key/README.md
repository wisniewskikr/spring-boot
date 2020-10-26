SPRING BOOT REST API SECURITY API KEY
=====================================


LOCALHOST URL
-------------

* URL: http://localhost:8080/app/greeting
* Credentials: header with values "key/password"


DESCRIPTION
-----------

This is simple Spring Boot REST API project which displays "Hello World" text in JSON. 
This project is secured by API Key Security.
Credentials are defined in file "application.properties".
 
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
* http://[server]/app/greeting