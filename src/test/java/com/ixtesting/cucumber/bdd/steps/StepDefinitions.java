package com.ixtesting.cucumber.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("Given an example scenario");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("When all step definitions are implemented");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("Then the scenario passes");
    }
}
