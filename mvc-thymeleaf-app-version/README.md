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
* Create working "Hello World" Spring Boot MVC Thymeleaf application;
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
* Create AbstractController. Make sure that every Controller extends this class 
* In AbstractController inject Spring class BuildProperties
* In AbstractController read application version and put it as ModelAttribute using class BuildProperties
* In HTML read ModelAttribute with version 
  

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