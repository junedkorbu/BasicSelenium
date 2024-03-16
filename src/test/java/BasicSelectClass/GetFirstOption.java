package BasicSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOption {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//To launch the application
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		Select s = new Select(dropdown);
//		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("Captain America");
		s.selectByVisibleText("Batman");
			
		System.out.println(s.getFirstSelectedOption().getText());
		
	}
}

