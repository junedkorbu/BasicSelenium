package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Watches");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("Perfume");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		
	}
}

