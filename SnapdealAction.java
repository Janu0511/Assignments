package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapdealAction {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		ChromeOptions options = new ChromeOptions();  
        options.addArguments("--disable-notifications");
        //mousehover to men's fashion
        Actions actions = new Actions(driver); 
		WebElement mensFashion = driver.findElement(By.xpath("//span[contains(text(), \"Men's Fashion\")]"));
		actions.moveToElement(mensFashion).perform(); 
		WebElement shoe = driver.findElement(By.xpath("//span[@class='linkTest']"));
        shoe.click();
        
        //total items of shoes shown
        String totalItems = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println("Total items of shoes:" +totalItems);
        //click on taining shoe
        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
        //sort from low to high 
        driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
        
        Thread.sleep(2000);
      //Check if the displayed items are sorted correctly
		List<WebElement> sort = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		for(int i=0;i<sort.size()-1;i++)
		System.out.println(sort.get(i).getText());
		
        //checking if sorted correct 
       // String sort = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
        //System.out.println("Filter applied for:" +sort);
        
        //filter by giving price range from 500-2000
        driver.findElement(By.xpath("//input[@class='input-filter']")).clear();
        driver.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("500");
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("2000");
        driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
       Thread.sleep(3000);
        //filter color
        WebElement select = driver.findElement(By.xpath("//a[text()=' White & Blue']"));
        driver.executeScript("arguments[0].click();", select);
        
        //mouse hover to quik view 1st product
        WebElement quickview = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
        actions.moveToElement(quickview).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
        Thread.sleep(3000);
        
       // print the price and discount
        String finalPrice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
        System.out.println("The final price is " +finalPrice);
       
        //snapshot
        File src = driver.getScreenshotAs(OutputType.FILE);
        File trg=new File("./Snapshot/Choosen Product.png"); // target file // . (present project)
        FileUtils.copyFile(src, trg);
        Thread.sleep(3000);
        
        //close current page
        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
        driver.close();
	}

}
