package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.myntra.com/");
		
		WebElement a = d.findElement(By.className("desktop-searchBar"));
	    a.sendKeys("Perfumes");
	    
	    Thread.sleep(3000);
	    
	    a.sendKeys(Keys.ENTER);
	    
		d.findElement(By.cssSelector("img[alt='Park Avenue Signature Collection Voyage Amazon Woods Intense Premium Perfume Spray 120 ml']")).click();
	}
}


