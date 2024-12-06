package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click crypto from news 
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement mousehover = driver.findElement(By.xpath("(//span[@class='_yb_7zamgg'])[3]"));
		actions.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("(//div[@class='_yb_7zamgg'])[19]")).click();
		
		//Locate the crypto currency row size
        List<WebElement> firstrow = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr"));
        int rowsize = firstrow.size();
		System.out.println("Total No of rows:"+rowsize);
		
	    //Locate the crypto currency column size
		 List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/thead/tr/th"));
         int colsize = column.size();
		 System.out.println("Total No of columns:"+colsize);
		 
		 //print the crypto names
		 List<WebElement> cryptoName = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr/td[2]")); 
         for (int i = 0; i <= cryptoName.size()-1 ; i++) {
         System.out.println(cryptoName.get(i).getText());
         }
         driver.close();
	}
}
