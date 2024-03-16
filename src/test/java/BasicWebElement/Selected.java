package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[text()='Men (8,209)']")).click();
		
		boolean men = driver.findElement(By.xpath("//label[text()='Men (8,209)']")).isSelected();
		System.out.println(men);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
