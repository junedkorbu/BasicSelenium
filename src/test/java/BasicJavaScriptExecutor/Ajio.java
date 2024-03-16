package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		WebElement a =driver.findElement(By.name("searchVal"));
		a.sendKeys("Watches");
		a.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
			
		while(true) {
		    try {
		    	driver.findElement(By.cssSelector("img[alt='Product image of Giordano Men Analogue Watch with Stainless Steel Strap-GZ-50083']")).click();
		    	break;
		    }catch(NoSuchElementException n)
		    {
		    	js.executeScript("window.scrollBy(0,2000)");
		    }
		}
		
	}
}
