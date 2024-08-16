package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main (String[] args) {
        try (var context = new AnnotationConfigApplicationContext( GamingConfiguration.class )) {
            context.getBean( GamingConsole.class ).up();
            context.getBean( GameRunner.class ).run();
        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
