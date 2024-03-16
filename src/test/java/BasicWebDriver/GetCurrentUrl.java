package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		
		String url = d.getCurrentUrl();
		System.out.println(url);
		
		WebElement a = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		a.sendKeys("Sunglasses");
		a.sendKeys(Keys.ENTER);
		
		System.out.println(d.getCurrentUrl());
		
		Thread.sleep(3000);
		
		d.close();
	}
}

