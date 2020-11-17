SPRING BOOT DOZER MAPPING
=========================


LOCALHOST URL
-------------

* URL: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot project which shows how Dozer Mapping works. Dozer Mapping enables easy mapping one class to another. 
Types of Dozer Mapping:
* Default: if two classes have variables with the same names. This project shows it displaying text: "Hello Word With Default Mapping!"
* Custom: if we want to map variable of one class to another variable of second class. This project shows it displaying text: "Hello World With Custom Mapping!"  

Implementations:
* add "dozer" dependency to pom
* specify mapping in xml file: src/main/resources/mappings/dozer-mapping.xml
* create mapping confing class: MappingConfig
* fix problem with devtools: src/main/resources/META-INF/spring-devtools.properties

To show result of Dozer Mapping additional technologies were used in this project: Spring MVC and Thymeleaf. But they are not necessary for Dozer Mapping.
  

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