SPRING BOOT MVC THYMELEAF AND LOGGING WITH LOMBOK
=================================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text and handles logging with Lombok.
Lombok is a dependency which helps you to remove unnecessary code. It this case it helps with logging. 

When the application is run then test logs are created for following levels: trace, debug, info, wart and error.
For test purpose only logs from level "info" are displayed. Logs are displayed:
* On Console;
* In file: **logs/app.log**. This file is archived and packed as "zip" every day or after size 1 KB. Archive location: **logs/archived**. 

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* Use application "Hello World" Spring Boot MVC Thymeleaf and logging as the base;
* In class GreetingController don't use Logger class any more. Instead use annotation @Slf4j
* In file "pom.xml" add Lombok dependecy

```
<!-- Lombok dependencies -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <scope>provided</scope>
</dependency>
```
 
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