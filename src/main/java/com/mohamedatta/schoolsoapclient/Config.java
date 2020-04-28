package com.mohamedatta.schoolsoapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
    	System.out.println("marshhhhhhhhhhhhhhhhhhh");

        marshaller.setContextPath("com.mohamedatta.school.schemas.students");
        return marshaller;
    }
 
    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
    	System.out.println("1111111111111111111111");
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://localhost:1234/service/studentDetailsWsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}