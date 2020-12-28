SPRING BOOT SOAP SERVER
=======================


LOCALHOST URL
-------------

* URL for WSDL: http://localhost:8080/app/ws/greeting.wsdl


DESCRIPTION
-----------

This is simple Spring Boot SOAP Server project. Application takes as input name and returns as output text "Hello World" + name. 
You have to use some SOAP Client to work this SOAP Server project. You can use for instance tool SoapUI.

Used technologies:
* BE: Spring Boot Web Services


IMPLEMENTATION
--------------

Implementation details:
* Add schema file "greeting-service.xsd" in location: "src/main/resources";
* Add in file "pom.xml" plugin "jaxb2-maven-plugin". It will automatically generate classes basing on schema file *.xsd;
* Create class WebServiceConfing. This class includes all configuration for Web Service SOAP;
* Create class GreetingWebServiceEndpoint. This class is endpoint fo Web Service SOAP Greeting.
  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to WSDL:
* http://[server]/app/ws/greeting.wsdl


```              
Example request:
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:elem="http://example.com/ws/elements">
   <soapenv:Header/>
   <soapenv:Body>
      <elem:greetingRequest>
         <elem:name>Chris</elem:name>
      </elem:greetingRequest>
   </soapenv:Body>
</soapenv:Envelope>

Example response:
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <ns2:greetingResponse xmlns:ns2="http://example.com/ws/elements">
         <ns2:message>Hello World Chris</ns2:message>
      </ns2:greetingResponse>
   </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```  



