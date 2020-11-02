package com.card.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * CardSystem
 * @author NG
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.card.system.repository"})
@EntityScan(basePackages = {"com.card.system.entity"})
@ComponentScan({"com.card.system.controller","com.card.system.converter"})
public class CardApplication extends SpringBootServletInitializer {



    public static void main(String[] args) {
        SpringApplication.run(CardApplication.class, args);


    }





}
