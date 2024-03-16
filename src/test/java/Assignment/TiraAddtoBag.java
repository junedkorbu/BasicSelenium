package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraAddtoBag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Fogg");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='fy__img image'])[3]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a: ids)
		{
			if((driver.switchTo().window(a).getTitle()).contains("Buy Fogg Punch Fragrance Body Spray (150ml) Online at Best Price in India - Tira"))
			{
				break;
			}
		}
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		Thread.sleep(6000);
		driver.quit();
	}
}
