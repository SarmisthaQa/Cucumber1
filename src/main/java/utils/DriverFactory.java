package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.ContactUsPage;
import pageObjects.LoginPage;

public class DriverFactory {

	public static WebDriver driver;
	public static ContactUsPage contactUsPage;
	public static LoginPage loginPage;

	public WebDriver getDriver() {

		try {
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();
			String url=file.getAppUrl();

			switch (browserName) {
			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get(url);
				}
				break;
			case "internetexplorer":
				if (null == driver) {
					System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER);
					DesiredCapabilities cap = new DesiredCapabilities();
					cap.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(new InternetExplorerOptions(cap));
					driver.manage().window().maximize();
					driver.get(url);
				}
				break;

			}

		} catch (Exception e) {
			System.out.println("Could not load browser : " + e.getMessage());
		}finally {
			//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
			contactUsPage=PageFactory.initElements(driver, ContactUsPage.class);
			loginPage=PageFactory.initElements(driver, LoginPage.class);
		}
		return driver;
	}

}
