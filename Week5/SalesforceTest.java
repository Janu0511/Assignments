package assignment.Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesforceTest extends Saticparametertestng  {

@Test
	public void runsalesforce() throws InterruptedException {
		
		//apps and view all   
		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		
		//mouse hover to legal enteties
		Actions action=new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        action.moveToElement(element).perform();
        driver.executeScript("arguments[0].click();", element);
        
        //click new entity
        driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
        //entity name
        driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Janani");
        //enter company name
        driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
        Thread.sleep(2000);
        //select description
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
        //status as active
        WebElement element2 = driver.findElement(By.xpath("//button[contains(@class, 'slds-combobox__input')]"));
        driver.executeScript("arguments[0].click();", element2);
        //dropdown    
        driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
        //To save
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		//verify entity name
        WebElement element3 = driver.findElement(By.xpath("//p[contains(@class,'fieldComponent slds-text-body')]"));
        String title1 = element3.getText();
         System.out.println(title1);
        
        if (title1.equalsIgnoreCase("TestLeaf")) {
        	System.out.println("Title name is verified:" +title1);
        }
        	else {
				System.out.println("Title is incorrect" );
        	}
	
}}


