package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		
//		d.findElement(By.xpath("//img[@alt='Mobiles' and @class='_2puWtW _3a3qyb']")).click();
		
//		d.findElement(By.xpath("//span[text()='mobiles']")).click();
		
		WebElement s = d.findElement(By.name("q"));
		s.sendKeys("Lenovo laptop");
		s.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
	   d.findElement(By.xpath("//a[contains(text(),'Lenovo IdeaPad Gaming 3 AMD Ryzen 5 Hexa Core 6600H - (...')]")).click();
		
	}
}








