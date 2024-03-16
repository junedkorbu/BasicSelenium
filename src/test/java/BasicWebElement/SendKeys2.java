package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("junedkorbu@gmail.com");
		
		Thread.sleep(2000);
		emailtf.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		emailtf.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']/..//div[@id='u_0_4_4H']")).click();
		
		
	}
}
