package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		               
        WebDriver d = new ChromeDriver();
		d.manage().window().maximize();		
		d.get("https://.flipkart.com/");
		
		Thread.sleep(15000);
		WebElement s = d.findElement(By.name("q"));
		s.sendKeys("Lenovo laptop");
		s.sendKeys(Keys.ENTER);
		
	}
}
