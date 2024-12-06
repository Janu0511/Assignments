package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to iframe 
		driver.switchTo().frame("iframeResult");
		//switch to iframe web element
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		
		Thread.sleep(3000);
		
		//alertbox
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Janani");
		alert.accept();
		
	   //to verify and print the text
		WebElement frame2 = driver.findElement(By.id("demo"));
		String text = frame2.getText();
		System.out.println(text);
	}
	
}
