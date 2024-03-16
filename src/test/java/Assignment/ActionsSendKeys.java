package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		WebElement bag = driver.findElement(By.xpath("//span[text()='Bag']"));
		Actions a = new Actions(driver);
	
		a.sendKeys(search, "Watches");
		Thread.sleep(2000);
		a.sendKeys(search, Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		a.sendKeys(search, Keys.CONTROL+"c");
		
		Thread.sleep(2000);
		a.sendKeys(search, Keys.CONTROL+"v");
		
		a.perform();
		
	}
}




