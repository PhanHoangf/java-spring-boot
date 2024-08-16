package com.in28minutes.learn_spring_framework.examples.a0;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DepSimpleInjectionLauncherApplication {
  public static void main (String[] args) {
    try (
      var context = new AnnotationConfigApplicationContext( DepSimpleInjectionLauncherApplication.class )
    ) {
    } catch ( BeansException e ) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
