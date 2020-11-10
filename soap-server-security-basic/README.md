SPRING BOOT SOAP SERVER WITH BASIC SECURITY
===========================================


LOCALHOST URL
-------------

* URL for WSDL: http://localhost:8080/app/ws/greeting.wsdl
* Credentials: user / password


DESCRIPTION
-----------

This is simple Spring Boot SOAP Server project. Application takes as input name and returns as output text "Hello World" + name.
Application is secured by Basic Security. Credentials are defined in file "application.properties".
You have to use some SOAP Client to work with this SOAP Server project. In SOAP Client credentials have to be added to "soapenv:Header". 
You can use for instance tool SoapUI.

Used technologies:
* BE: Spring Boot Web Services
  

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
Example request (pay attention on "soapenv:Header" - there is security included):
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:elem="http://example.com/ws/elements">
   <soapenv:Header>
    <wsse:Security soapenv:mustUnderstand="1" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
        <wsse:UsernameToken>
            <wsse:Username>user</wsse:Username>
            <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">
            		password
            </wsse:Password>
        </wsse:UsernameToken>
    </wsse:Security>
</soapenv:Header>
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



