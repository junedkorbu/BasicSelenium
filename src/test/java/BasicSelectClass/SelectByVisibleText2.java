package BasicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
//		WebElement dropdown = driver.findElement(By.id("fruits"));
		WebElement dropdown = driver.findElement(By.id("country"));
		
		Select s = new Select(dropdown);
		
//		s.selectByVisibleText("Apple");
//		s.selectByValue("1");
		s.selectByIndex(6);
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
