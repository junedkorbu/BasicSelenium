package BasicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		Select s = new Select(dropdown);
		
		System.out.println(s.isMultiple());
		
		
	}
}
