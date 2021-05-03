SPRING BOOT REST API AND SECURITY BASIC
=======================================


LOCALHOST URL
-------------

* URL GET: http://localhost:8080/app/greeting
* URL POST: http://localhost:8080/app/greeting

Credentials: user / password


DESCRIPTION
-----------

#####Goal
The goal of this project shows how to create simple Spring Boot REST API application secured by BASIC security.

#####Details
This project handles two HTTP methods: GET and POST. All methods are secured by BASIC security.

#####Result 
The result of this project is JSON with text "<HTTP method>: Hello World". You can run this project in Browser (only GET) 
or in any REST API Client.

#####Used technologies:
* BE: Spring Boot REST API


IMPLEMENTATION
-----------

Prerequisites:
* This project is an extension of project "rest-api". Only differences between these two projects are displayed here.

Implementation details:
* In file "pom.xml" add security dependency "spring-boot-starter-security";
* In file "application.properties" add API Credentials;
* Create class "SecurityConfig.java" where all security details are configured.
  

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