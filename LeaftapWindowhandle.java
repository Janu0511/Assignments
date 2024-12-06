package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapWindowhandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 ChromeOptions options = new ChromeOptions();  
	     options.addArguments("--disable-notifications");
	     
	     //login details
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	     driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
	     //click crmsfa link
		 driver.findElement(By.xpath("//div[@id='label']")).click();
		 //click contact 
		 driver.findElement(By.xpath("(//div[@class='x-panel-tl'])[3]")).click();
		 //click merge 
		 driver.findElement(By.partialLinkText("Merge Contacts")).click();
		 //click widget from contact 
		 driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		 
		 //move to child window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> childWindow = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(childWindow.get(1));
		 
		 //select the 1st contact
		 driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		 driver.switchTo().window(childWindow.get(0));
	
		 //select 2 widget
		 driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a[2]")).click();
		 //switch windows
		 Set<String> windowHandles1 = driver.getWindowHandles();
		 List<String> childWindow1 = new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(childWindow1.get(1));
		 
		 //select the 2nd contact		 
		 driver.findElement(By.xpath("(//a[@class='linktext'])[11]")).click();
		 driver.switchTo().window(childWindow1.get(0));
		 
		 //merge
		 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//alertbox
			Alert alert = driver.switchTo().alert();
			alert.accept();
		 
			//get title of webpage
			String title = driver.getTitle();
			System.out.println("Webpage title is:" +title);
			driver.close();
	}

}
