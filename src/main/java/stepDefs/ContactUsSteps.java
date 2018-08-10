package stepDefs;

import static org.testng.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory{

	
	@Given("^User is on application home page to view contact us$")
	public void user_is_on_application_home_page() throws Throwable {
	}
	
	@Given("^User clicks on Contact us link$")
	public void user_clicks_on_Contact_us_link() throws Throwable {
		contactUsPage.getContactUsPage();
	}

	@When("^enters firstname as \"([^\"]*)\"$")
	public void enters_firstname_as(String arg1) throws Throwable {
	contactUsPage.enterFirstName(arg1);
	}

	@When("^enters lastname as \"([^\"]*)\"$")
	public void enters_lastname_as(String arg1) throws Throwable {
		contactUsPage.enterLastName(arg1);
	}

	@When("^enters email as \"([^\"]*)\"$")
	public void enters_email_as_asd_cv(String arg1) throws Throwable {
		contactUsPage.enterEmail(arg1);
	}

	@When("^enters comments as$")
	public void enters_comments_as(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> com=(List<List<String>>) arg1.raw();
		contactUsPage.enterMessage(com.get(0).get(0));
	}

	@When("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		contactUsPage.clickSubmitButton();
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) throws Throwable {
		contactUsPage.verifySuccessMessage(arg1);
	}
	
}
