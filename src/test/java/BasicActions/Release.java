package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Release {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.cssSelector("div[class='ic-cart ']"));
		Actions a = new Actions(driver);
		a.clickAndHold(cart);
		
		Thread.sleep(2000);
//		a.release();
		a.release(cart);
		a.perform();
		
		
		
	}
}



