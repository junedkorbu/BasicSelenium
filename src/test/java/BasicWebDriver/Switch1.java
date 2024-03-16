package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.manage().window().maximize();
		
		WebElement a = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		a.sendKeys("Sunglasses");
		a.sendKeys(Keys.ENTER);
		
		d.findElement(By.cssSelector("img[alt='Mast & Harbour Men Black Lens & Silver-Toned Sunglasses With UV Protected Lens']")).click();
//		(url)(d.getCurrentUrl()).switchTo();
		
		//To check how many windows are present
		Set<String> ids= d.getWindowHandles();
		System.out.println(ids);
		
		for(String a1: ids)
		{
			String title1= d.switchTo().window(a1).getTitle();
			System.out.println(title1);
		}
//		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
//		
//		Thread.sleep(5000);
//		d.quit();
	}
}
