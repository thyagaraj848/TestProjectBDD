package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	
	
@CucumberOptions(
	    features = "src/test/resources/Features/Orang.feature",
	    glue = {"StepDefintions"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html"
	    },
	    monochrome = true,
	    publish = true
	)
	
	public class Testrunner extends AbstractTestNGCucumberTests
	{
//		
//		@Override
//		@DataProvider
//		public Object[][] scenarios()
//		{
//		
//		return super.scenarios();	
//		}
		
	
	
	
}
