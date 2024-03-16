package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		String att = driver.findElement(By.className("desktop-searchBar")).getAttribute("class");
		System.out.println(att);
		
		String tag = driver.findElement(By.className("desktop-searchBar")).getTagName();
		System.out.println(tag);
		
		String css = driver.findElement(By.className("desktop-searchBar")).getCssValue("border-radius");
		System.out.println(css);
		
//		driver.quit();
	}
}




