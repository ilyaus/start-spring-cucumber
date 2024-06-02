package com.ixtesting.cucumber.bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features", 
    glue = "com.ixtesting.cucumber.bdd.steps",
    plugin = {"pretty", "html:target/cucumber"}
)
public class RunCucumberTests {
    
}
