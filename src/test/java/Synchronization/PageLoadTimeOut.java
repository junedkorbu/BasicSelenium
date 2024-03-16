package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
     }
}