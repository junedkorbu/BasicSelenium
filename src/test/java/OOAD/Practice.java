package OOAD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
//		SearchContext driver = new ChromeDriver();
//		driver.findElement(null);
//		driver.findElements(null);
		
//		TakesScreenshot driver = new ChromeDriver();
//		driver.getScreenshotAs(null);
		
//		JavascriptExecutor driver = new ChromeDriver();
//		driver.executeScript(null, args);
//		driver.executeAsyncScript(null, args);
		
		WebDriver driver = new ChromeDriver();
		driver.get(null);
		driver.getCurrentUrl();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.navigate();
		driver.manage();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.switchTo();
		driver.close();
		driver.quit();
		driver.findElement(null);
		driver.findElements(null);
	}
}
