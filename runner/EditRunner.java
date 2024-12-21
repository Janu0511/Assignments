package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\edit.feature",glue={"stepDefinition","hooks"},publish=true,monochrome=true)

public class EditRunner extends AbstractTestNGCucumberTests{

}
