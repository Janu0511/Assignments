package stepDefinition;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leadspage extends ProjectSpecificMethod {
	
	@When("Click on LoginButton")
	public void Click_on_Login_Button() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
	}

	@Then("Verify Login is Successful")
	public void Verify_Login_is_Successful() {
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Login is not successful");
		}
	}

	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
	   driver.findElement(By.linkText("CRM/SFA")).click(); 
	}

	@When("Click on Leads Button")
	public void Click_on_Leads_Button() {
	    driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Verify the leads clicked")
	public void Verify_the_leads_clicked() {
	    String ld = driver.getTitle();
	    if(ld.contains("My Leads")) {
	    	System.out.println("Leads Button is clicked");
	    }else {
	    	System.out.println("Leads Button is not clicked");
	    }
	    
	}

}

