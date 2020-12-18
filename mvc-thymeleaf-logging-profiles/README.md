SPRING BOOT MVC THYMELEAF AND LOGGING WITH PROFILES
===================================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text and handles logging with profiles.
Logging with profiles means that different logs are created basing on profile. In this example we have two profiles:
* **Default Spring Boot profile**: logs are stored in location **<app>/logs**;
* **Tomcat Server profile**: logs are stored in location **${catalina.base}/logs/app**. 

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* Use application "Hello World" Spring Boot MVC Thymeleaf as the base;
* Create file "application-tomcat.properties" with properties for profile "tomcat". File location: "src/main/resources";
* In file "application-tomcat.properties" add property "logging.config" with logging file location for profile "tomcat";
* Create file "logback-spring-tomcat.xml" with logging configuration for profile "tomcat". Create new LOG_PATH: **${catalina.base}/logs/app**; 
* In this example profile "tomcat" should be run on Tomcat server and logs should be stored there together with classic Tomcat logs. 

Implementation details for Tomcat (Optional - only if you want to run application on Tomcat with "tomcat" profile):
* Update Tomcat file: **"/tomcat/conf/catalina.properties"**. Please add following property: **spring.profiles.active=tomcat**.
  

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