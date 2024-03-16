package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynamic {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		WebElement s = d.findElement(By.name("q"));
		s.sendKeys("samsung s24 ultra");
		s.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		Thread.sleep(4000);
//		d.close();
	}
}




