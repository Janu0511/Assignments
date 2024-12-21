package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\create.feature",glue={"stepDefinition","hooks"},publish=true,monochrome=true)

public class CreateRunner extends AbstractTestNGCucumberTests {
      
}
