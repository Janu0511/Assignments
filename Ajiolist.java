package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajiolist {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launching the url
		driver.get("https://www.ajio.com/");
		
		//searching for bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		
		//clicking men's and fashion bags
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		//to get total items displayed
		Thread.sleep(5000);
		String totalitems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total items present in men's fashion:" +totalitems);
		
		//creating object to get list of detials
		List<WebElement> brandname= driver.findElements(By.className("brand"));
		int count = brandname.size();
		System.out.println("No.of brands displayed in the page : "+ count);
		System.out.println();
		//iterate to get each brand names
			for (int i = 0; i < count; i++) {
			System.out.println(i+1 +" " +brandname.get(i).getText());
		}
			List<WebElement> bagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
			int size = bagnames.size();
			System.out.println();
			//iterate to get bag names
			for (int i = 0; i < size; i++) {
				System.out.println(i+1 +" " +bagnames.get(i).getText());
			}
			driver.close();
}}


