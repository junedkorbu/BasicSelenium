package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeJquery {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop);
		a.perform();
	}
}
