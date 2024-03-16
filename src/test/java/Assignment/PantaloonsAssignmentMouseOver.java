package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PantaloonsAssignmentMouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pantaloons.com/");
		
		List<WebElement> nav = driver.findElements(By.xpath("//div[@class='menu ']"));
		
		Actions a = new Actions(driver);
		
		for(WebElement e : nav)
		{
			a.moveToElement(e).perform();
			Thread.sleep(4000);
		}
	}
}
