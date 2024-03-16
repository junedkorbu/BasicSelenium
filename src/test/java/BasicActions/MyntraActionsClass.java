package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraActionsClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement bag = driver.findElement(By.xpath("//span[text()='Bag']"));
		
		Actions a = new Actions(driver);
		
		//Click on webpage
//		a.click();
		
		//click on bag webelement
		a.click(bag);
		
		//Call Perform
		a.perform();
		
		
	}
}
