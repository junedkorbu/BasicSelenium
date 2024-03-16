package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	 public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
//			EdgeDriver d = new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.jio.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 
			//Search the element-Mobile & Perform action on the element- Click
			driver.findElement(By.linkText("Mobile")).click();
			
			//Search the element-True 5G & Perform action on the element- Click
			driver.findElement(By.partialLinkText("True")).click();
			
			//Search the element-JioFiber & Perform action on the element- Click\
			driver.findElement(By.linkText("JioFiber")).click();
			
			//Search the element-AirFiber & Perform action on the element- Click
			driver.findElement(By.linkText("AirFiber")).click();
			
			//Search the element-Buisness & Perform action on the element- Click
			driver.findElement(By.linkText("Business")).click();
			
			//Search the element-Devices & Perform action on the element- Click
			driver.findElement(By.linkText("Devices")).click();
			
			//Search the element-Apps & Perform action on the element- Click
			driver.findElement(By.linkText("Apps")).click();
			
			//Search the element-Support & Perform action on the element- Click
			driver.findElement(By.linkText("Support")).click();
			
			driver.quit();
	}
}
