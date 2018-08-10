package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

	public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
	public @FindBy(xpath = "//input[@name='last_name']") WebElement textfield_LastName;
	public @FindBy(xpath = "//input[@name='email']") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//textarea[@name='message']") WebElement textfield_Message;
	public @FindBy(xpath = "//input[@value='SUBMIT']") WebElement button_Submit;
	public @FindBy(id = "contact-us") WebElement link_Contactus;
	public @FindBy(id = "contact_reply") WebElement success_Message;

	public ContactUsPage() throws IOException {
		super();
	}

	public ContactUsPage getContactUsPage() throws InterruptedException, IOException {
		waitAndClickElement(link_Contactus);
		return new ContactUsPage();
	}

	public void enterFirstName(String fname) throws Exception {
		for (String win : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(win);
		}
		sendKeysToWebElement(textfield_FirstName, fname);

	}
	public void enterLastName(String lname) throws Exception {
		sendKeysToWebElement(textfield_LastName, lname);
	}
	public void enterEmail(String email) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, email);
	}
	public void enterMessage(String message) throws Exception {
		sendKeysToWebElement(textfield_Message, message);
	}
	public void clickSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);
	}
	public void verifySuccessMessage(String msg) throws InterruptedException {
		assertTrue(getElementText(success_Message).equalsIgnoreCase(msg));
	}
}
