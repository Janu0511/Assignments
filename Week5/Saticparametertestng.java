package assignment.Week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Saticparametertestng {

	public ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	
@BeforeMethod 
	public  void precondition( String url, String username, String password) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	driver=new ChromeDriver(option);
	
	driver.get(url );
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
    //login path
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("(//input[@id='Login'])[1]")).click();
}
	
@AfterMethod 
	    
   public void postcondition() {
	 driver.close();
	}
	
}


