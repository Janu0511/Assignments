package assignment2.Week5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Salesforce extends Dynamicparametertestng  {

	@DataProvider(name="getdata") 
	public String[][] fetchData() throws IOException {
		return Datalibrary.readvalue();
	}
	
	     
@Test(dataProvider= "getdata")
	public void runsalesforce(String name) throws InterruptedException {
		System.out.println(name);
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
        driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
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


