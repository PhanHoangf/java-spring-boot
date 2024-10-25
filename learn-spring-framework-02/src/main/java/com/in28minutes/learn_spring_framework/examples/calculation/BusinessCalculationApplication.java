package com.in28minutes.learn_spring_framework.examples.calculation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessCalculationService {
  DataService dataService;

  BusinessCalculationService (DataService dataService) {
    this.dataService = dataService;
  }

  public int findMax () {
    return Arrays.stream( dataService.retrieveData() ).max().orElse( 0 );
  }
}

@Configuration
@ComponentScan
public class BusinessCalculationApplication {
  public static void main (String[] args) {
    try ( var context = new AnnotationConfigApplicationContext( BusinessCalculationApplication.class ) ) {
      System.out.println( context.getBean( BusinessCalculationService.class ).findMax() );
    } catch ( BeansException e ) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
