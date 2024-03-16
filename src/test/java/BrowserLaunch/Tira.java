package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tira {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/?gclid=Cj0KCQiAwvKtBhDrARIsAJj-kTidbrlB2Rf1O_aY9QZyBZy8xQoF0Xe6vVC5_qSden45aMCebm0sCXwaAtFBEALw_wcB");
		
		WebElement a = d.findElement(By.id("search"));
		a.sendKeys("Perfumes");
		a.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		d.findElement(By.xpath("(//img[@class='fy__img image'])[2]")).click();
	}
}
