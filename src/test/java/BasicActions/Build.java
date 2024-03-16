package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(home);
		//Call Perform
//		a.perform();
		a.build();  //In Selenium 3 version to build the actions class element & to perform action 
	}
}
