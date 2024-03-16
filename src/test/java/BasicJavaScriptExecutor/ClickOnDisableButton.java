package BasicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisableButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
	    driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
	    
	    WebElement btn = driver.findElement(By.partialLinkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
	
	    js.executeScript("arguments[0].click()", btn);
	}
}
