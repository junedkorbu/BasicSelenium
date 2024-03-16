package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePathFlipkart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("html/body/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div/a[1]/div/div/div/div/img")).click();
		
		Thread.sleep(3000);
		
		d.quit();
	}
}
