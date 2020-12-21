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
* Use application "Hello World" Spring Boot MVC Thymeleaf with standard logging as the base;
* Create file "application-tomcat.properties" with properties for profile "tomcat". File location: "src/main/resources". Add there following properties:

```
# Logging
logging.level.root=INFO
logging.file.name=${catalina.base}/logs/app/app.log
logging.pattern.console=%d %p %C{1.} [%t] %m%n
logging.pattern.file=%d %p %C{1.} [%t] %m%n
logging.pattern.rolling-file-name=${catalina.base}/logs/app/archived/app-%d{yyyy-MM-dd}.%i.zip
logging.file.max-size=1KB
logging.file.max-history=1
logging.file.clean-history-on-start=false
spring.output.ansi.enabled=ALWAYS
```

**Implementation details for Tomcat** (Optional - only if you want to run application on Tomcat with "tomcat" profile)
In this example profile "tomcat" should be run on Tomcat server and logs should be stored there together with classic Tomcat logs:
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