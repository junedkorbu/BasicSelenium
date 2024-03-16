package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Create Object of WebDriverWait class
		//in that constructor pass argument as (Webdriver ref, Duration)
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		//Step 2: Call method until()
		//Pass predicate function(Condition method) as argument inside until method
		w.until(ExpectedConditions.titleIs("Online Shopping for Women, Mens, Kids Fashion & Lifestyle - Myntra"));
		System.out.println("Not getting exception");
	}
}
