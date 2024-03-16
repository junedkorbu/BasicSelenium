package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		WebElement bag = driver.findElement(By.xpath("//span[text()='Bag']"));
		Actions a = new Actions(driver);

//		a.sendKeys(bag, Keys.ENTER);
//		a.perform();
//		a.sendKeys("Shoes");
//		a.sendKeys(search, "Shoes");
//		a.perform();
		
//		a.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(6000);
//		a.sendKeys(Keys.PAGE_UP);
//		a.perform();
		
		a.sendKeys(search, "Watches");
		Thread.sleep(2000);
		a.sendKeys(search, Keys.CONTROL+"a");
		a.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}








