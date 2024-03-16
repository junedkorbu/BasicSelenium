package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		WebElement a =d.findElement(By.name("searchVal"));
		a.sendKeys("Shoes");
		a.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//strong[text()='ATOM']")).click();
	}
}
