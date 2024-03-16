package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetcodeIpEdit {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://letcode.in/test");
		
		d.manage().window().maximize();
		
		d.findElement(By.linkText("Edit")).click();
		
		d.findElement(By.id("fullName")).sendKeys("Juned Shakil Korbu");
	}
}
