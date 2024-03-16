package BasicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> nav = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/div"));
		
		Actions a = new Actions(driver);
		
		for(WebElement e : nav)
		{
			a.moveToElement(e).perform();
			Thread.sleep(2000);
		}
	}
}
