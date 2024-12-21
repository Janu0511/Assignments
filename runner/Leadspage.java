package runner;

import baseClass.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/ClickonLeads.feature",  glue="stepDefinition", publish=true, monochrome=true)

public class Leadspage extends ProjectSpecificMethod {  

	//public - basic report of cucumber
	//monochrome- it will remove the junk values
	
}
