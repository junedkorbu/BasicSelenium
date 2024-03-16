package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAjio {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.ajio.com/");
		
		String title = d.getTitle();
		System.out.println(title);
		
//		System.out.println(d.getTitle());
		
		WebElement a = d.findElement(By.name("searchVal"));
		a.sendKeys("Perfumes");
		a.sendKeys(Keys.ENTER);
		
		String perfumeTitle = d.getTitle();
		System.out.println(perfumeTitle);
		
		System.out.println(d.getCurrentUrl());
		
		d.quit();
	}
}
