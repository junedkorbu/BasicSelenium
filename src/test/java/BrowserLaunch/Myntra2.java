package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Wathches");
		
		d.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Men']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		
	}
}
