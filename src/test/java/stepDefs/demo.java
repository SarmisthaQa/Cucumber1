package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo {


@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Throwable {
}

@Given("^some other precondition$")
public void some_other_precondition() throws Throwable {
}

@When("^I complete action$")
public void i_complete_action() throws Throwable {
}

@When("^some other action$")
public void some_other_action() throws Throwable {
}

@When("^yet another action$")
public void yet_another_action() throws Throwable {
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() throws Throwable {
}

@Then("^check more outcomes$")
public void check_more_outcomes() throws Throwable {
}


	
}
