package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait3FetchUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.myntra.com/");
		
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Walllet");
		search.sendKeys(Keys.ENTER);
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(4));
		
		
		//Fetch the url of current webpage
		String walletUrl =driver.getCurrentUrl();
		System.out.println(walletUrl);
		//https://www.myntra.com/walllet?rawQuery=Walllet
		w.until(ExpectedConditions.urlContains("https://www.myntra.com/walllet?ju"));
		
		System.out.println("Exception not getting");
		driver.findElement(By.xpath("//label[text()='Women']")).click();
	}
}




