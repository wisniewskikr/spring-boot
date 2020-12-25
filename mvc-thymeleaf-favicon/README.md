SPRING BOOT MVC THYMELEAF AND FAVICON
=====================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text and display favicon in browser.
Favicon is small icon displayed in browser`s tab near page title.  
 
Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* Use application "Hello World" Spring Boot MVC Thymeleaf as the base;
* Create your own favicon. You can use following web site: https://www.favicon.cc ;
* Put your icon in location: "src/main/resources/static/icons/favicon.ico";
* Place following code in section "head" of your page:

```
<!-- Icon favicon -->
  <link rel="shortcut icon" type="image/x-icon" th:href="@{/icons/favicon.ico}"/>
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