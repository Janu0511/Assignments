package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Staticparameter {
	
	public ChromeDriver driver;
	
	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		
		ChromeOptions msg = new ChromeOptions();
		msg.addArguments("--Disable-notifications");
		driver = new ChromeDriver(msg);
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
	}
	
	@When("enter the username as {string}")
	public void enter_the_username_as(String username) {

		driver.findElement(By.id("username")).sendKeys(username);
	}
	@When("enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.id("Login")).click();
	}
	
@Then("Click the App Launcher Icon next to setup")
public void click_the_app_launcher_icon_next_to_setup() {
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
}

@Then("Click View All and Select Accounts from App launcher")
public void click_view_all_and_select_accounts_from_app_launcher() throws InterruptedException {
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	//select account
	WebElement element = driver.findElement(By.xpath("//p[text()='Accounts']"));
	Actions action = new Actions(driver);
	action.scrollToElement(element).perform();
	Thread.sleep(2000);
	element.click();
}

@Then("Search the account name as Janani s")
public void search_the_account_name_as_janani_s() throws InterruptedException {
	
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Janani s", Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Janani s']")).click();
}

@Then("Click the dropdown icon and select Edit")
public void click_the_dropdown_icon_and_select_edit() {
	driver.findElement(By.xpath("(//button[contains(@class,'slds-button_last')])[2]")).click();

	// Edit button
	WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
	driver.executeScript("arguments[0].click();", edit);
}

@Then("Set Type to Technology Partner")
public void set_type_to_technology_partner() {
	WebElement type = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[2]"));
	driver.executeScript("arguments[0].click();", type);

	WebElement tech = driver.findElement(By.xpath("//span[text()='Technology Partner']"));
	tech.click();
}

@Then("Set Industry to HealthCare")
public void set_industry_to_health_care() {
	WebElement industry = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[4]"));
	driver.executeScript("arguments[0].click();", industry);

	WebElement option = driver.findElement(By.xpath("//span[text()='Healthcare']"));
	driver.executeScript("arguments[0].click();", option);
}

@Then("Enter the Billing address to {string}")
public void enter_the_billing_address_to(String billingcity) {
	WebElement bill = driver.findElement(By.xpath("//input[@name='city']"));
	bill.sendKeys(billingcity);
}

@Then("Enter the Shipping address to {string}")
public void enter_the_shipping_address_to(String shippingcity) {
	WebElement ship = driver.findElement(By.xpath("(//input[@name='city'])[2]"));
	ship.sendKeys(shippingcity);

}

@Then("Set Customer Priority to Low")
public void set_customer_priority_to_low() {
	WebElement customer = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[5]"));
	driver.executeScript("arguments[0].click();", customer);

	WebElement low = driver.findElement(By.xpath("//span[text()='Low']"));
	driver.executeScript("arguments[0].click();", low);
}

@Then("Set SLA to Silver")
public void set_sla_to_silver() {
	WebElement sla = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[6]"));
	driver.executeScript("arguments[0].click();", sla);

	WebElement silver = driver.findElement(By.xpath("//span[text()='Silver']"));
	driver.executeScript("arguments[0].click();", silver);
}

@Then("Set Active to NO")
public void set_active_to_no() {
	WebElement active = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[8]"));
	driver.executeScript("arguments[0].click();", active);

	WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
	driver.executeScript("arguments[0].click();", no);
}

@Then("Enter a Unique Phone number {string}")
public void enter_a_unique_phone_number(String phoneNum) {
	WebElement number = driver.findElement(By.xpath("//input[@name='Phone']"));
	number.sendKeys(phoneNum);
}

@Then("Set Upsell Opportunity to NO")
public void set_upsell_opportunity_to_no() {
	
	WebElement option = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[7]"));
	driver.executeScript("arguments[0].click();", option);

	WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
	driver.executeScript("arguments[0].click();", no);
}

@Then("Click Save")
public void click_save() {
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
}

@Then("verify the phone number")
public void verify_the_phone_number() {
	
	String no = driver.findElement(By.xpath("//a[text()='9123456789']")).getText();
	System.out.println("Phone Number:" + no);
	if (no.contains(no)) {

		System.out.println("Number is Verified");

	} else {

		System.out.println("Number is not Verified");
	}
}

}
