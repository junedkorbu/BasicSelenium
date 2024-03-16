package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pentaloons {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.pantaloons.com/?utm_source=affiliate&utm_medium=cps_jan&utm_campaign=xploredigital_28&gclid=Cj0KCQiA2eKtBhDcARIsAEGTG40O7xHeVZHhn_CRlWIcJhIZJ1oAb5_rNS4rFh6t4FR653VTQNuiA5UaAgOaEALw_wcB");
		
		WebElement search = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		
		search.sendKeys("shoes sneaker");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement a = d.findElement(By.xpath("//select[@class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']"));
		
		a.sendKeys("Price - Low to High");
		a.sendKeys(Keys.ENTER);
		
//		Thread.sleep(3000);  .sendKeys("Price - Low to High")
		
//		d.findElement(By.cssSelector("img[src='https://imagescdn.pantaloons.com/img/app/product/6/693464-7416244.jpg?q=75&auto=format&w=250&h=400?q=75&auto=format&w=250&h=400']")).click();
//		
//		Thread.sleep(3000);

//		d.close();
	}
}



