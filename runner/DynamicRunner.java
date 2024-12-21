package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\Dynamic.feature",glue="stepDefinition", publish=true,monochrome=true)


public class DynamicRunner  extends AbstractTestNGCucumberTests {
	
}
