SPRING BOOT REST API
====================


LOCALHOST URL
-------------

* **URL GET**: http://localhost:8080/app/greeting
* **URL POST**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create Java application with Spring Boot API. 

#####Details
This project consists of two API endpoints:
* **GET Greeting**: API method GET returns JSON with "Hello World" text;
* **POST Greeting**: API method POST returns JSON with "Hello World" text.

#####Result 
Please use some API Client to test this application (for instance "RESTer").
After run GET or POST method the text "Hello World" should be returned as JSON.

#####Used technologies:
* **BE**: Spring Boot API


IMPLEMENTATION
-----------

#####Prerequisites:
* None

#####Implementation details:
* Create file pom.xml with all necessary Spring Boot dependencies;
* Create Application class with name Application to run project;
* Create Controller class with name GreetingController. This class contains all endpoints;
* Create AbstractResponse class with common response fields like "status" and "message";
* Create GreetingResponse class with specific response fields for Greeting;
* Create file with properties of application: src/main/resources/application.properties.
  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run


USAGE
-----

Link to main UI:
* http://[server]/app/greeting