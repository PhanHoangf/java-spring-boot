package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main (String[] args) {
        var context = new AnnotationConfigApplicationContext( HelloWorldConfiguration.class );
//        System.out.println( context.getBean( "name" ) );
//        System.out.println( context.getBean( "person" ) );
//        System.out.println( context.getBean( "address" ) );
//        System.out.println( context.getBean( "person2MethodCall" ) );
        Arrays.stream( context.getBeanDefinitionNames() ).forEach( System.out::println );
    }
}
