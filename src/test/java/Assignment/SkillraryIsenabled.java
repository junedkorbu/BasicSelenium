package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryIsenabled {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
//		driver.findElement(By.id("gdpr-cookie-accept")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'SkillRary Demo APP')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a:ids)
		{
			if((driver.switchTo().window(a).getCurrentUrl()).contains("https://demoapp.skillrary.com/"))
			{
				break;
			}
		}
		
		boolean tf = driver.findElement(By.className("form-control")).isEnabled();
		System.out.println(tf);
		
	}
}
