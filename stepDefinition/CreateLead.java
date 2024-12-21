package stepDefinition;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {
	

@When("Crmsfa link should be clicked")
public void crmsfa_link_should_be_clicked() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}

@When("Account tab should be clicked")
public void account_tab_should_be_clicked() {
	// Click the Account tab
			driver.findElement(By.linkText("Accounts")).click();
}

@When("Create account button should be clicked")
public void create_account_button_should_be_clicked() {
	// Click create account button
			driver.findElement(By.linkText("Create Account")).click();
}

	@When("Account name should be entered as {string}")
	public void account_name_should_be_entered_as(String accName) {
		// Entering the account name by removing the hardcoded values and replace with
		// the variables
		driver.findElement(By.id("accountName")).sendKeys(accName);

	}

	@When("Submit button should be clicked")
	public void submit_button_should_be_clicked() {
		// Click the submit button
				driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Check account is created")
	public void check_account_is_created() {
		// Check and print the account created
				String name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
				System.out.println("Account  name is:" + name);
	}

}
