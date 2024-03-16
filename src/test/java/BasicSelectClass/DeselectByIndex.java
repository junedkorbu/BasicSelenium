package BasicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement secDropdown = driver.findElement(By.id("superheros"));
		
		Select s = new Select(secDropdown);
		
		s.selectByVisibleText("Iron Man");
		s.selectByVisibleText("Marvelman");
		
		Thread.sleep(4000);
		
//		s.deselectByVisibleText("Iron Man");
//		s.deselectByValue("mm");
//		s.deselectByIndex(19);
		
		
		
	}
}
