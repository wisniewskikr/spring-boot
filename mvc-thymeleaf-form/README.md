SPRING BOOT MVC AND THYMELEAF WITH FORM
=======================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

#####Goal
The goal of this project is to show to create application with simple form using technologies Spring Boot MVC and Thymeleaf. 

#####Details
This project consists following pages:
* Greeting Page: this page contains input filed with name. After submit text "Hello World" + name is displayed below input field.

#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Prerequisites:
* Downloaded project "mvc-thymeleaf".

Implementation details:
* Update class GreetingCommand.java;
* Update class GreetingController.java;
* Update file "greeting.html" with form;
* Update file "custom.css" with form styles.
  

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