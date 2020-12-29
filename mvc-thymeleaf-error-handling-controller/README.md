SPRING BOOT MVC THYMELEAF AND ERROR HANDLING
============================================


LOCALHOST URL
-------------

* URL: http://localhost:8080/app/greeting
* URL with default error: http://localhost:8080/app/greeting-error
* URL with 404 error: http://localhost:8080/app/greeting-wrong-url
* URL with error thymeleaf: http://localhost:8080/app/greeting-error-thymeleaf


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text. 
It handles also two types of errors basing on class ErrorController:
* Default Errors: errors from inside of application
* 404 Error: error with missing resources 

Used technologies:
* BE: Spring Boot MVC
* FE: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* The base should be working "Hello World" Spring Boot MVC Thymeleaf application;
* Create class ErrorController where all errors should be handled;
* Create HTML page "error.html" which should be displayed when some error occurs.

  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Links to main UI:
* http://[server]/app/greeting
* http://[server]/app/greeting-error
* http://[server]/app/greeting-wrong-url
* http://[server]/app/greeting-error-thymeleaf