package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://licindia.in/?utm_source=Google&utm_medium=CPC&utm_campaign=Search-Generic-Life-Insurance-LIC-Main-Page-PD&gad_source=1&gclid=CjwKCAiA29auBhBxEiwAnKcSqlnmf5W8J-18JvP4OpHPHhscrX5rZMbHQaRO2qO1umJQS7O6u_WG7xoCY90QAvD_BwE");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.findElement(By.xpath("//span[text()=' Pay Premium ']")).click();
		
		driver.switchTo().alert().dismiss();
		
//		driver.switchTo().alert().accept();
		
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		
	}
}
