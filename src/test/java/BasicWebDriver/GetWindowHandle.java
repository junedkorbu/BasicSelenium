package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		
//		String url = d.getCurrentUrl();
//		System.out.println(url);
		
		WebElement a = d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		a.sendKeys("Sunglasses");
		a.sendKeys(Keys.ENTER);
		
//		System.out.println(d.getCurrentUrl());
		
		//to get current window id
	    String parentId = d.getWindowHandle();
	    System.out.println(parentId);
	    
	    d.findElement(By.cssSelector("img[alt='Voyage Unisex Square Sunglasses 58157MG2970']")).click();
	    
	    //to get all windows id 
	    Set<String> childId = d.getWindowHandles();
	    System.out.println(childId);
//	    for(String a1 : childId)
//	    {
//	      System.out.println(a1);	
//	    }
	     
		Thread.sleep(3000);
		
		d.quit();
	}
}
