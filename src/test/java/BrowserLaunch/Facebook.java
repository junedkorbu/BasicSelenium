package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
//		d.findElement(By.partialLinkText("Forgotten password?")).click();
		
		d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}
}


