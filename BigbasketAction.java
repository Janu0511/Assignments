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
import org.openqa.selenium.interactions.Actions;

public class BigbasketAction {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		ChromeOptions options = new ChromeOptions();  
        options.addArguments("--disable-notifications");
        //click shop by category
        driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]")).click();
        
        Thread.sleep(2000);
        //mouse hover to vegetable and oil - boiled rice
        Actions actions = new Actions(driver);
        WebElement selection1 = driver.findElement(By.xpath("(//a[contains(@class, 'CategoryTree___StyledLink')])[32]"));
        actions.moveToElement(selection1).perform();
        Thread.sleep(2000);
        
        WebElement selection2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
        actions.moveToElement(selection2).perform();
        Thread.sleep(2000);
        
        WebElement selection3 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
        actions.moveToElement(selection3).perform();
        selection3.click();
        
        //click on filter bb royal
        WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'px-2.5 lg:py-1.5')])[2]/following::label[text()='BB Royal']"));
        Thread.sleep(2000);
        driver.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        //select tamil ponni
       WebElement element2 = driver.findElement(By.xpath("(//h3[contains(@class, 'block m-0 ')])[4]"));
       driver.executeScript("arguments[0].click();", element2);
        
        //navihgate to other window
         Set<String> windowHandles = driver.getWindowHandles();
		 List<String> getwindow=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(getwindow.get(1));
		 
		 Thread.sleep(2000);
		 //select  5 kg 
		 WebElement element3 = driver.findElement(By.xpath("(//div[@class='w-40 xl:w-52'])[5]"));
		 driver.executeScript("arguments[0].click();", element3);
		 
		 //price of rice printed
		 String element4 = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		 System.out.println(element4);
		 
		 //add to basket 
		 driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		 
		 //cart confirmation
		// String cartMsg = driver.findElement(By.xpath("//div[@class='self-center']/following::p[@class='mx-4 flex-1']")).getText();
		// System.out.println("Confirmation msg:" +cartMsg);
		 
		 Thread.sleep(5000);
		//screenshot
		 File src = driver.getScreenshotAs(OutputType.FILE); //source file
         File trg=new File("./Snapshot/Cart image.png"); // target file // . (present project)
         FileUtils.copyFile(src, trg);  //combining src and trg
        
        //close child window and parent window seperately
         driver.close();
         driver.switchTo().window(getwindow.get(0));
         driver.close();
         
	}
}
