//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.18 at 09:29:59 AM CET 
//


package com.example.we.elements;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.we.elements package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.we.elements
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetingRequest }
     * 
     */
    public GreetingRequest createGreetingRequest() {
        return new GreetingRequest();
    }

    /**
     * Create an instance of {@link GreetingResponse }
     * 
     */
    public GreetingResponse createGreetingResponse() {
        return new GreetingResponse();
    }

    /**
     * Create an instance of {@link GreetingError }
     * 
     */
    public GreetingError createGreetingError() {
        return new GreetingError();
    }

}
