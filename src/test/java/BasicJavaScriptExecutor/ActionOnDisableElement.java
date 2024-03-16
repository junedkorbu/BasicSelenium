package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisableElement {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(2000);
		WebElement tf = driver.findElement(By.cssSelector("input[class='form-control']"));
		
		//Step 1 : Downcasting to access the executeScript method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Step 2 : Call executescript(String script,object)
		js.executeScript("arguments[0].value='juned'", tf);
	}
}
