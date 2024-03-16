package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PantaloonsAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
//		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/?utm_source=google&utm_medium=search&utm_campaign=google_pure_brand_exact&gad_source=1&gclid=Cj0KCQiA5fetBhC9ARIsAP1UMgFiK5DH3YIUaNI13p-v4mxpDAfCVzlsPbyYNokhcibj954WRt6DT0AaAgOzEALw_wcB");
		
		WebElement a = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		a.sendKeys("Wallet");
		a.sendKeys(Keys.ENTER);
		
		d.findElement(By.xpath("//p[text()='Gender']")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("//div[contains(text(),'Men')]")).click();
		Thread.sleep(4000);
//		d.findElement(By.xpath("(//div[text()='Peter England'])[2]")).click();
		d.findElement(By.xpath("(//img[@alt='Textured Leather Wallet'])[1]")).click();
		
		Thread.sleep(4000);
		for(int i=1; i<=1;i++) {
			d.findElement(By.className("Quantity_plus__2gUw9")).click();
		}
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
//		d.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text add-to-cart-button']")).click();
		
		Thread.sleep(4000);
		d.findElement(By.cssSelector("a[href='/cart']")).click();
	}
}



