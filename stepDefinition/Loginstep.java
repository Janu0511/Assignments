package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
  public ChromeDriver driver;

	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	   
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys(pass);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
	}

	@Then("Verify login is Successful")
	public void verify_login_is_successful() {
	    
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Login is not successful");
		}
	}
}
