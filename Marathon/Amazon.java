package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.amazon.in/" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//search items in searchbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//print tota; no of results found
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("The total no of results found:" +result);
		
		//select 2 brands items
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		//filter 
		driver.findElement(By.xpath("(//span[contains(@class,'declarative')])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		
		// Prints the name & discount 
		String name = driver.findElement(By.xpath("(//h2[@class = 'a-size-mini s-line-clamp-1']/span)[2]")).getText();
		System.out.println("The Name of the bag is:"+name);
					
		String off = driver.findElement(By.xpath("(//span[text()='(69% off)'])[1]")).getText();
		System.out.println("Discount for the bag is:"+off);
					
					
		//Prints the title of the Webpage
		 String title = driver.getTitle();
		 System.out.println("Title of the  WebPage is :" + title);
					 
		 driver.close();			
		
	}

}
