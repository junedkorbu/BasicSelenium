package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/?gad_source=1&gclid=Cj0KCQiAoKeuBhCoARIsAB4WxtdNhPp-X8vlzA9seYITR2wqrMOGbgxWacbRgn2PmNxHp5qbWHJJgOkaAt1bEALw_wcB");
		
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Perfumes");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		String text= driver.findElement(By.xpath("(//div[@class='product-name'])[1]")).getText();
		System.out.println(text);
		
		driver.quit();
		
	}
}

