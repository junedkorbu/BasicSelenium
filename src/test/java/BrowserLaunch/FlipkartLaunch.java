package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaunch {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		d.findElement(By.name("q")).sendKeys("Laptop");
		
		d.findElement(By.tagName("svg")).click();
		
		d.findElement(By.className("_396cs4")).click();
			
	}
}







