package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
		driver.get("https://www.ajio.com/");
		
		//Step 1 : Downcasting to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Top to bottom
		js.executeScript("window.scrollTo(0,3000)");
		
//		Thread.sleep(2000);
		
		//Bottom to Top
//		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	    
		//Left to Right
//		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		
		Thread.sleep(2000);
		//Right to left 
//		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		
		Thread.sleep(4000);
		driver.quit();
	}
}
