SPRING BOOT MVC AND THYMELEAF
=============================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create Java application with Spring Boot MVC and Thymeleaf. 

#####Details
This project consists of one page:
* **Greeting Page**: this page just displays text "Hello World".

#####Result 
After copy URL in browser`s address field a user is redirected to Greeting Page. Text "Hello World" is displayed.

#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

#####Prerequisites:
* None

#####Implementation details:
* Create file pom.xml with all necessary Spring Boot dependencies;
* Create Application class with name Application to run project;
* Create Controller class with name GreetingController;
* Create Command class with name GreetingCommand;
* Create HTML template with name "greeting.html";
* Create file with CSS: src/main/resources/static/css/custom.css;
* Create file with JS: src/main/resources/static/js/custom.js;
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