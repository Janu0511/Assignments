package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation {
	public ChromeDriver driver;

	@Given("load the url")
	public void load_the_url() {
		
		ChromeOptions msg = new ChromeOptions();
		msg.addArguments("--Disable-notifications");
		driver = new ChromeDriver(msg);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("enter the username as dilip@testleaf.com")
	public void enter_the_username_as_dilip_testleaf_com() {
	    driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("enter the password as leaf@{int}")
	public void enter_the_password_as_leaf(Integer int1) {
	    driver.findElement(By.id("password")).sendKeys("leaf@2024");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("Login")).click();
	}

	@Then("click on the toggle button")
	public void click_on_the_toggle_button() {
		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']")).click();	
		}

	@When("click view all")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
	}

	@When("click sales")
	public void click_sales() {
		WebElement sales = driver.findElement(By.xpath("(//div[@class='slds-truncate'])[6]"));
		driver.executeScript("arguments[0].click();", sales);
	}

	@When("click on account tab")
	public void click_on_account_tab() {
	    WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
	    driver.executeScript("arguments[0].click();", acc);
	}

	@When("click on new button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
	}

	@When("enter acc name")
	public void enter_acc_name() {
	   driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Janani s");
	}

	@When("select ownership as public")
	public void select_ownership_as_public() throws InterruptedException {
		WebElement select = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__')])[4]"));
		driver.executeScript("arguments[0].click();", select);
		
		Thread.sleep(2000);

		WebElement Public = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", Public);
		
		//save it 
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify acc name")
	public void verify_acc_name() {
		String accname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		System.out.println("Account name is:" + accname);

		if (accname.contains("Janani s")) {
			System.out.println("Account is created as:" +accname);

		} else {
			System.out.println("Account is not created");
		}
	   
		driver.close();
	} 
}
