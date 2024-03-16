package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSwitchTo {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.manage().window().maximize();
		
		WebElement a = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		a.sendKeys("Sunglasses");
		a.sendKeys(Keys.ENTER);
		
		d.findElement(By.cssSelector("img[alt='Voyage Unisex Square Sunglasses 58157MG2970']")).click();
		
		Set<String> ids =d.getWindowHandles();
		
		for(String a1:ids)
		{
			String title = d.switchTo().window(a1).getTitle();
			
			if(title.contains("Buy Voyage Unisex Square Sunglasses 58157MG2970 - Sunglasses for Unisex 10748540 | Myntra"))
			{
				break;
			}
		}
		
		System.out.println(d.getTitle());
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		Thread.sleep(3000);
		
		for(String a2: ids)
		{
			if((d.switchTo().window(a2).getTitle()).contains("Shop for Sunglasses Online in India | Myntra"))
			{
				break;
			}
		}
		
		System.out.println(d.getTitle());
		
	}
}
