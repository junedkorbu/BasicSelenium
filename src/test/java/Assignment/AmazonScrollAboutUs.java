package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollAboutUs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=2499189835229037854&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062097&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    js.executeScript("window.scrollBy(0,4900)");
	    
	    driver.findElement(By.linkText("About Us")).click();
	}
}
