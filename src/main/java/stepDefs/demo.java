package stepDefs;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo {

	WebDriver driver;
	
/*@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\gitProjects\\Cucumber1\\src\\test\\java\\driver\\chromedriver_win32\\chromedriver.exe");
	this.driver=new ChromeDriver();
	
}
@After
public void teardown() {
	this.driver.quit();
}
*/
@Given("^User navigates to StackOverFlow web site$")
public void user_navigates_to_StackOverFlow_web_site() throws Throwable {
	this.driver.get("https://stackoverflow.com/");
	AssertJUnit.assertTrue(driver.getTitle().equals("Stack Overflow - Where Developers Learn, Share, & Build Careers"));
}

@When("^User clicks on login button on main page$")
public void user_clicks_on_login_button_on_main_page() throws Throwable {
}

@When("^User enters valid user_name and password$")
public void user_enters_valid_user_name_and_password() throws Throwable {
}

@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
}

@Then("^User should be able to login$")
public void user_should_be_able_to_login() throws Throwable {
}




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
