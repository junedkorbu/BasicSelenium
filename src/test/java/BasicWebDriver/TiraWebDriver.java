package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		
		//To search perfume and Enter
		WebElement search = d.findElement(By.id("search"));
		search.sendKeys("Perfumes");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		//to cilck on perfume image
		d.findElement(By.cssSelector("img[alt='Estee Lauder | Estee Lauder Pleasures Eau De Parfum Spray (30ml)']")).click();
		
		//to Get all window ids
		Set<String> ids = d.getWindowHandles();
		
		//Transfer control from parent window to child window
		for(String a: ids)
		{	
			if ((d.switchTo().window(a).getTitle()).contains("Estee Lauder Pleasures Eau De Parfum Spray (30ml)")) {
				System.out.println(d.getTitle());
				break;
			}
		}
		
//		System.out.println(d.getTitle());
		
		Thread.sleep(3000);
		//To click on Add to Bag button in child window
		d.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		Thread.sleep(2000);
		//Transfer control from child window to parent window
		for(String a1: ids)
		{	
			if ((d.switchTo().window(a1).getTitle()).contains("Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com")) {
				System.out.println(d.getTitle());
				break;
			}
		}						
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Brand']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()=' Engage ']")).click();
		
		
		
		Thread.sleep(10000);
		d.quit();
	}
}
