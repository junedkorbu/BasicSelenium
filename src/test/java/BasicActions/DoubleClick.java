package BasicActions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(2000);
		WebElement course = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(course);
		a.perform();
		
		WebElement qa = driver.findElement(By.xpath("(//a[text()='QA'])[1]"));
		a.click(qa);
		a.perform();
		
		Thread.sleep(2000);
		WebElement plus = driver.findElement(By.id("add"));
		a.doubleClick(plus);
		a.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
