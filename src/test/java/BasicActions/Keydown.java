package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
//		WebElement bag = driver.findElement(By.xpath("//span[text()='Bag']"));
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).perform();
		a.click(driver.findElement(By.xpath("//span[text()='MEN']"))).perform();
		a.keyUp(Keys.CONTROL).perform();
	}
}




