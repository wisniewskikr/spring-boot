SPRING BOOT MVC
===============


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text. 

Used technologies:
* **BE**: Spring Boot MVC


IMPLEMENTATION
-----------

Implementation details:
* Create file pom.xml with all necessary Spring Boot dependencies;
* Create Application class with name Application to run project;
* Create Controller class with name GreetingController;
* Create file with properties of application: src/main/resources/application.properties.
  

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