package BasicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
//		List<WebElement> nav = driver.findElements(By.cssSelector("a[class='desktop-main']"));
		
		List<WebElement> nav = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		
		Actions a = new Actions(driver);
		for(WebElement e : nav)
		{
			System.out.println(e.getText());
			a.moveToElement(e).perform();
		}
		
		
	}
}

