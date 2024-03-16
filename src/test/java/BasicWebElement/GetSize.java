package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Dimension sizeOfEmail = driver.findElement(By.id("email")).getSize();
		System.out.println(sizeOfEmail);
		System.out.println(sizeOfEmail.getWidth());
		System.out.println(sizeOfEmail.getHeight());
		
		Point locationOfEmail =driver.findElement(By.id("email")).getLocation();
		System.out.println(locationOfEmail);
		System.out.println(locationOfEmail.getX());
		System.out.println(locationOfEmail.getY());
		
		Point locationOfLogin = driver.findElement(By.id("loginbutton")).getLocation();
		System.out.println(locationOfLogin);
		System.out.println(locationOfLogin.getX());
		System.out.println(locationOfLogin.getY());
		
		driver.quit();
		
	}
}

