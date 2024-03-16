package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Edit")).click();
		
		boolean confirm = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(confirm);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
