package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
//		driver.findElement(By.name("login")).submit();
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgotten account?")).submit();
		
		WebElement heading = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		System.out.println(heading.getTagName());
		
	}
}





