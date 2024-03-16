package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisableELe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement disTf=driver.findElement(By.id("noEdit"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,200)");
		js.executeScript("arguments[0].value='junu'", disTf);
	}
}
