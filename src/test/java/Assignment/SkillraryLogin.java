package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLogin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
//		driver.findElement(By.id("gdpr-cookie-accept")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[contains(text(),'SkillRary Demo APP')]")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		Set<String> ids = driver.getWindowHandles();
		
		for(String a:ids)
		{
			if((driver.switchTo().window(a).getCurrentUrl()).contains("https://demoapp.skillrary.com/"))
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("junedkorbu@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Junedkorbu@786");
		
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        System.out.println(checkbox.isDisplayed());
        checkbox.click();
        
        Thread.sleep(2000);
        driver.findElement(By.id("last")).click();
		
	}
}
