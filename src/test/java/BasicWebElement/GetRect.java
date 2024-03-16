package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Rectangle rec = driver.findElement(By.xpath("//a[text()='Create new account']")).getRect();
		System.out.println(rec);
		System.out.println(rec.getWidth());
		System.out.println(rec.getHeight());
		System.out.println(rec.getX());
		System.out.println(rec.getY());	
	}
}
