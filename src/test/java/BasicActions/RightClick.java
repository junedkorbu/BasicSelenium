package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		Actions a = new Actions(driver);
		//Right click on webpage
		//a.contextClick();
		
		//Right click on search textfield webElement
		a.contextClick(search);
		
		//Call the perform() method to execute the action
		a.perform();
		
				
	}
}
