package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		ChromeOptions options = new ChromeOptions();  
        options.addArguments("--disable-notifications");
        
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// TO get price for 1st product
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price for the first listed product is:" +text);
		//to get the cx rating no
		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Customer rating for 1st product:" +text2);
		
		// first link 
		WebElement link = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		link.click();
		
		//windowhandling to next page
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> getwindow=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(getwindow.get(1));
		 
		//screenshot
		 File src = driver.getScreenshotAs(OutputType.FILE); //source file
         File trg=new File("./Snapshot/First Product.png"); // target file // . (present project)
         FileUtils.copyFile(src, trg);  //combining src and trg
		
         // Click the cart button directly 
         WebElement element = driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]"));
         driver.executeScript("arguments[0].click();", element);
         
         Thread.sleep(3000);
         //to verify the subtotal
         String total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
         System.out.println("Sub total amount is:" +total);
         
         driver.quit();
	}
}
