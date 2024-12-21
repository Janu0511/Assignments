package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicData {
	
	public ChromeDriver driver;
	
	@Given("Load the url")
	public void load_the_url() {
		
		//disable the notification
				ChromeOptions notice = new ChromeOptions();
			notice.addArguments("--disable-notifications");
			
				//load the url
				driver=new ChromeDriver(notice);
				driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://login.salesforce.com");
	}
	@When("login to salesforce")
	public void login_to_salesforce() {
		//login to salesforce
				driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
				driver.findElement(By.id("password")).sendKeys("leaf@2024");
				driver.findElement(By.id("Login")).click();
	}
	@When("Click on toggle menu button")
	public void click_on_toggle_menu_button() {
		//click on toggle menu
		driver.findElement(By.xpath("//button[contains(@class,'slds-context-bar__button')]")).click();
	}
	@When("Click view All and click Sales")
	public void click_view_all_and_click_sales() {
		//click on view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
			
			//click on sales
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		//click on Accounts tab
		WebElement Acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", Acc);

	}
	@When("Click on New button")
	public void click_on_new_button() {
		//click on new
		driver.findElement(By.xpath("//div[text()='New']")).click();

	}
	@When("Enter account name as {string}")
	public void enter_account_name_as(String name) {
		//enter the name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		//select ownership
				WebElement owner = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
				Actions act = new Actions(driver);
				act.scrollToElement(owner).perform();
				driver.executeScript("arguments[0].click();",owner);
				
				driver.findElement(By.xpath("//span[text()='Public']")).click();

	}
	@When("Click on save")
	public void click_on_save() {
		//click on save button
				driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();	}
	@Then("verify Account name")
	public void verify_account_name() {
		//get text from page
		WebElement Name = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String accountname = Name.getText();
		System.out.println(accountname);
		//verify the account name
		if (accountname.contains("Jan")) {
			System.out.println("Account name was Verified "); 
			}else {
				System.out.println("Account name mismatch");
			}
		
		//close the page
		driver.close();	
		}
}
