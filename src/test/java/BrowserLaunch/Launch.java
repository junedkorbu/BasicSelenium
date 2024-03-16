package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String []args) throws InterruptedException
	{
	   ChromeDriver d = new ChromeDriver();
	   
	   d.get("https://www.flipkart.com/");
	   
	   d.get("https://www.myntra.com/");
	   
	   d.navigate().back();
	   d.navigate().forward();
	   d.navigate().back();
	   d.manage().window().maximize();
//	   d.manage().window().minimize();
	   d.findElement(By.name("q")).sendKeys("Laptop");
	   
	   Thread.sleep(5000);
	   
	   d.close();
//	   d.quit();
	}
}











