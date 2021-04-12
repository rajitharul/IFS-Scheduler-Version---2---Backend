package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.ParseException;

@SpringBootApplication
@EntityScan("com.example")
@ComponentScan("com.example")
@EnableJpaRepositories("com.example")
public class Login02Application {

    public static void main(String[] args)  {

        SpringApplication.run(Login02Application.class, args);

    }

}
