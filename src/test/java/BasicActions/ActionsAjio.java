package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAjio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		//identify targeted element
		WebElement men = driver.findElement(By.xpath("//span[text()='WOMEN']"));
		
		//Create Object of Actions class
		//Pass the WebDriver reference intop the Actions constructor 
		Actions a = new Actions(driver);
		
		//Call the actions class method-moveToElement()
		a.moveToElement(men);
		
		//call perform() method to execute the action
		a.perform();
		
	}
}
