package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step {

	@Given("^User is on application home page$")
	public void user_is_on_application_home_page() throws Throwable {
	}

	@Given("^clicks on login section$")
	public void clicks_on_login_section() throws Throwable {
	}

	@When("^enters username as \"([^\"]*)\"$")
	public void enters_username_as(String arg1) throws Throwable {
	}

	@When("^enters password as \"([^\"]*)\"$")
	public void enters_password_as(String arg1) throws Throwable {
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	}
	
}
