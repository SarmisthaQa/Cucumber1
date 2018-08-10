package stepDefs;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	@Before
	public void setup() throws IOException {
		driver = getDriver();

	}

	@After
	public void teardownAndScenarioScreenShotOnFailure(Scenario scenario) {
		try {
			if(driver != null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch(Exception e) {
			System.out.println("Method Failed: screenshotOnFailure, Exception: " + e.getMessage());
		}
	}

}
