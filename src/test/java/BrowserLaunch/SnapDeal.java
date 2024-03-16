package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		
		d.manage().window().maximize();
		
		d.findElement(By.id("inputValEnter")).sendKeys("Laptop Bags");
		
		d.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']")).click();
		
//		d.findElement(By.partialLinkText("Help")).click();
	}
}








