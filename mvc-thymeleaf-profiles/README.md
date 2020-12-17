SPRING BOOT MVC THYMELEAF AND PROFILES
======================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays text: "Hello World!" + current profile. 

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* Use as the base Spring Boot MVC Thymeleaf Hello World application;
* Rename file "application.properties" to "application-default.properties". Add property: "profile.type=Default Profile";
* Create file "application-tomcat.properties". Add property: "profile.type=Tomcat Profile";
* Update class GreetingController. Read property "profile.type" and add it to displayed text.

Implementation details for Tomcat (Optional - only if you want to run application on Tomcat with Tomcat Profile):
* Update Tomcat file: **"/tomcat/conf/catalina.properties"**. Please add following property: **spring.profiles.active=tomcat**.

  

LAUNCH
------

To launch project with **Default Profile** please use Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false

To launch project with **Tomcat Profile** please use Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false -Dspring-boot.run.profiles=tomcat


USAGE
-----

Link to main UI:
* http://[server]/app/greeting