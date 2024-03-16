package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToELement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		WebElement beauty = driver.findElement(By.xpath("//span[text()='BEAUTY']"));
		Actions a = new Actions(driver);
//		a.moveToElement(beauty);
		Thread.sleep(2000);
//		a.moveToElement(beauty, -300, 0);
		a.moveByOffset(450, 200).contextClick();
		a.perform();
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}



