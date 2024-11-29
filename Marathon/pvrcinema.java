package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pvrcinema {

	public static void main(String[] args) throws InterruptedException {
    
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.pvrcinemas.com/" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		//cjoose cinema and selecct loacation
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
		Thread.sleep(1000);
		//select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//select movie,time and confirm booking
		driver.findElement(By.xpath("(//span[text()='ZEBRA'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='03:15 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		//select seat and proceed 
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		driver.findElement(By.id("PR.PREMIERE|A:1")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatinfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println(seatinfo);
		
		//print seat info and total price
		String total = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(total);
		
		//get webpage title
		String webpage = driver.getTitle();
		System.out.println(webpage);
		
		driver.close();
	}

}
