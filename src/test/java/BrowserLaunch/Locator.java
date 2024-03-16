package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://www.pantaloons.com/?utm_source=affiliate&utm_medium=cps_jan&utm_campaign=xploredigital_28&gclid=CjwKCAiAtt2tBhBDEiwALZuhAE3O4cUg_nvcNdo0mCnfLdCMtSEMKDgpNU81xuasOei6PR85GNrl0xoCJbsQAvD_BwE");
		
		//To search element- Search text field
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("Wallet");
		
		d.findElement(By.className("search-bar-content-textSearch-icon")).click();
		
		Thread.sleep(5000);
		
		d.close();
	}
}






