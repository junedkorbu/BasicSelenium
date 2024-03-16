package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMyntra {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
			
		Dimension sizestf =driver.findElement(By.className("desktop-searchBar")).getSize();
		System.out.println(sizestf);
		
		Rectangle rec = driver.findElement(By.className("desktop-searchBar")).getRect();
		System.out.println(rec);
		System.out.println(rec.getWidth());
		System.out.println(rec.getHeight());
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getDimension());
		System.out.println(rec.getPoint());
		
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
		Dimension sizeofWatch = driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).getSize();
		System.out.println(sizeofWatch);
		
	}
}

