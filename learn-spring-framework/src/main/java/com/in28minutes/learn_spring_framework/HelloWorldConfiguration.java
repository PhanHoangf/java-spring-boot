package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Hazel";
    }

    @Bean
    public int age () {
        return 25;
    }

    @Bean
    public Person person () {
        return new Person( "Hazelk", 30 );
    }

    @Bean
    public Person person2MethodCall () {
        return new Person( name(), age() );
    }

    @Bean
    public Address address () {
        return new Address( "HCMC", "Go Vap" );
    }
}
