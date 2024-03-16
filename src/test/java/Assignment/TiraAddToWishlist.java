package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraAddToWishlist {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();		
		d.get("https://www.tirabeauty.com/?gclid=Cj0KCQiAwvKtBhDrARIsAJj-kTjNbJER809bHTwIvw-5PBRb0s7bA3RmX8yYuXVGdq71g35S4j9XCYUaAoRYEALw_wcB");
		
		WebElement a = d.findElement(By.id("search"));
		a.sendKeys("Perfume");
		a.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//img[@class='fy__img image'])[2]")).click();
		
		Set<String> ids = d.getWindowHandles();
		
		for(String a1 : ids)
		{
			if((d.switchTo().window(a1).getTitle()).contains("Buy Layer'r Wottagirl! Body Splash Set (4Pcs) Online at Best Price in India"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Save to Wishlist')]")).click();
		
		System.out.println(d.getTitle());
	}
}




