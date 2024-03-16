package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.manage().window().maximize();
		
//		WebElement a = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
//		a.sendKeys("Sunglasses");
//		a.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(2000);
		
//		d.navigate().back();
//		
//        Thread.sleep(2000);
//		
//		d.navigate().forward();
//		
//		Thread.sleep(2000);
//		
//		d.navigate().refresh();
		
//		System.out.println(d.getPageSource());
		
	    d.navigate().to("https://www.myntra.com/sunglasses?rawQuery=sunglasses");
		
		Thread.sleep(4000);
		
		d.quit();
	}
}
