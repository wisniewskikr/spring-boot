SPRING BOOT MVC THYMELEAF AND LOGGING
=====================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text and handles logging.
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
* Use application "Hello World" Spring Boot MVC Thymeleaf as the base;
* In class GreetingController add test logs for following levels: trace, debug, info, wart and error;
* Add folder "logs" to file .gitignore;
* Add logging properties to file "application.properties":

```
# Logging
logging.level.root=INFO
logging.file.name=logs/app.log
logging.pattern.console=%d %p %C{1.} [%t] %m%n
logging.pattern.file=%d %p %C{1.} [%t] %m%n
logging.pattern.rolling-file-name=logs/archived/app-%d{yyyy-MM-dd}.%i.zip
logging.file.max-size=1KB
logging.file.max-history=1
logging.file.clean-history-on-start=false
spring.output.ansi.enabled=ALWAYS
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