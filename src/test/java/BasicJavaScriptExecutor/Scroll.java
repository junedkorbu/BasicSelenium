package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
   
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/");
		
		//Step 1 : Downcasting to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(200,0)");
		
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(-200,0)");
		
		//Step 2 : Call executeScript (String script , Object)
//		js.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(3000);
		
//		js.executeScript("window.scrollBy(0,-4000)");
		
//		Thread.sleep(5000);
//		driver.quit();
	}
}
