package stepDefs;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {
	
	@Given("^User is on application home page$")
	public void user_is_on_application_home_page() throws Throwable {
	}

	@Given("^clicks on login section$")
	public void clicks_on_login_section() throws Throwable {
		loginPage.getLoginPage();
	}

	@When("^enters username as \"([^\"]*)\"$")
	public void enters_username_as(String arg1) throws Throwable {
		for(String win: getDriver().getWindowHandles()) {
			getDriver().switchTo().window(win);
		}
		loginPage.enterUserName(arg1);
	}

	@When("^enters password as \"([^\"]*)\"$")
	public void enters_password_as(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	}
	
	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^user will get \"([^\"]*)\" message$")
	public void user_will_get_message(String arg1) throws Throwable {
		loginPage.verifySuccessMessage(arg1);
	}
	
}
