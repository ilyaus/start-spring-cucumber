package com.ixtesting.cucumber.bdd.steps;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestConfig.class)
public class CucumberSpringConfiguration {
    
}
