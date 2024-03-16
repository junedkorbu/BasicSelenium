package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.partialLinkText("Dialog")).click();
		
		//To click on Simple alert button
//		driver.findElement(By.id("accept")).click();
		
		//To click on ok button
//	    driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("confirm")).click();
		
//		driver.switchTo().alert().dismiss();
		
//		String s = driver.switchTo().alert().getText();
//		System.out.println(s);
		
		
		
		//Prompt alert
		driver.findElement(By.id("prompt")).click();
		
		driver.switchTo().alert().sendKeys("Juned");
		
		driver.switchTo().alert().accept();
	}
	
}
