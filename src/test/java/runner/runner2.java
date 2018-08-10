package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	features= {"src\\test\\java\\bddFeatures"},
			glue= {"stepDefs"},
			monochrome=true,
			tags= {},
				//	plugin= {"html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
			plugin= {"pretty","html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
			
)

public class runner2 {

}
