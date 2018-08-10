package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class LoginPage extends BasePage {

	public @FindBy(xpath = "//input[@id='text']") WebElement textfield_UserName;
	public @FindBy(xpath = "//input[@id='password']") WebElement textfield_PassWord;
	public @FindBy(xpath = "//button[@id='login-button']") WebElement button_Login;
	public @FindBy(id = "login-portal") WebElement link_Login;

	public LoginPage() throws IOException {
		super();
	}

	public void getLoginPage() throws InterruptedException, IOException {
		waitAndClickElement(link_Login);
	}

	public void enterUserName(String uname) throws Exception {
		for (String win : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(win);
		}
		sendKeysToWebElement(textfield_UserName, uname);

	}

	public void enterPassword(String pwd) throws Exception {
		sendKeysToWebElement(textfield_PassWord, pwd);
	}

	public void clickLoginButton() throws Exception {
		button_Login.click();
	}

	public void verifySuccessMessage(String msg) throws InterruptedException {
		Alert at = getDriver().switchTo().alert();
		AssertJUnit.assertEquals(at.getText().toLowerCase(), msg.toLowerCase());
		at.accept();
	}
}
