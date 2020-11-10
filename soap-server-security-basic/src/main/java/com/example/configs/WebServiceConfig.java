package com.example.configs;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.security.xwss.callback.SimplePasswordValidationCallbackHandler;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Value(value = "${soap.username}")
    private String soapUsername;
    @Value(value = "${soap.password}")
    private String soapPassword;

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
			ApplicationContext applicationContext) {
		
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
		
	}

	@Bean(name = "greeting")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
		
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("GreetingServicePort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://example.com/ws/elements");
		wsdl11Definition.setSchema(customerSchema());
		return wsdl11Definition;
		
	}

	@Bean
	public XsdSchema customerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("greeting-service.xsd"));
	}
	
	@Bean
	public XwsSecurityInterceptor securityInterceptor() {
		
		XwsSecurityInterceptor securityInterceptor = new XwsSecurityInterceptor();
		securityInterceptor.setCallbackHandler(callbackHandler());
		securityInterceptor.setPolicyConfiguration(new ClassPathResource("securityPolicy.xml"));
		return securityInterceptor;
		
	}

	@Bean
	public SimplePasswordValidationCallbackHandler callbackHandler() {
		
		SimplePasswordValidationCallbackHandler callbackHandler = new SimplePasswordValidationCallbackHandler();
		callbackHandler.setUsersMap(Collections.singletonMap(soapUsername, soapPassword));
		return callbackHandler;
		
	}

	@Override
	public void addInterceptors(List<EndpointInterceptor> interceptors) {
		
		interceptors.add(payloadLoggingInterceptor());
		interceptors.add(payloadValidatingInterceptor());
		interceptors.add(securityInterceptor());
		
	}

	@Bean
	public PayloadLoggingInterceptor payloadLoggingInterceptor() {
		return new PayloadLoggingInterceptor();
	}

	@Bean
	public PayloadValidatingInterceptor payloadValidatingInterceptor() {
		
		final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
		payloadValidatingInterceptor.setSchema(new ClassPathResource("greeting-service.xsd"));
		return payloadValidatingInterceptor;
		
	}
	
}
