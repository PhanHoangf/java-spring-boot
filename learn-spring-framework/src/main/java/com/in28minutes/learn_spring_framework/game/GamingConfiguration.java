package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game () {
        return new PacmanGame();
    }

    @Bean
    @Primary
    public GamingConsole game2 () {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner (GamingConsole game2) {
        return new GameRunner( game2 );
    }
}
