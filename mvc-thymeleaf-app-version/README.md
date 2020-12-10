SPRING BOOT MVC THYMELEAF APP VERSION
=====================================


LOCALHOST URL
-------------

* URL: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text and application`s version. 

Used technologies:
* BE: Spring Boot MVC
* FE: Thymeleaf


IMPLEMENTATION
--------------

Implementation details:
* You have to have working "Hello World" Spring Boot MVC Thymeleaf application;
* Update spring-boot-maven-plugin plugin in pom.xml

```
<!-- Package as an executable jar/war -->
<plugin>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-maven-plugin</artifactId>
	<executions>
        <execution>
            <id>build-info</id>
            <goals>
                <goal>build-info</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
* Inject Spring class BuildProperties in Controller
* Using class BuildProperties read application version and put it as ModelAttribute
* Read ModelAttribute with version in HTML
  

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