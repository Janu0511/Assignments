package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\loginWithMultipleData.feature",  glue="stepDefinition", publish=true, monochrome=true)

public class LoginPage extends AbstractTestNGCucumberTests {

	
	
}
