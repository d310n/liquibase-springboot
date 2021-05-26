package com.example.liquibasespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseSpringboot
{
    public static void main(String[] args)
    {
        SpringApplication.run(LiquibaseSpringboot.class, args);
        System.out.println("Hello World!");
    }
}
