package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
//		a.dragAndDrop(drag, drop);
//		a.perform();                                      
		
		//perform drag and drop with the help of click&hold(WT),moveToELement(WT),release(WT)
		
		a.clickAndHold(drag).moveToElement(drop).release();
		a.perform();
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
