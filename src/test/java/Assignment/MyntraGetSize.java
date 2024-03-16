package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraGetSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.myntra.com/");
		
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a1:ids)
		{
			if((driver.switchTo().window(a1).getCurrentUrl()).contains("https://www.myntra.com/watch-gift-set/joker+%26+witch/joker--witch-unisex-set-of-2-mike--phoebe-couple-watches-gift-set-jwcw97/24296018/buy"))
			{
				break;
			}
		}
		
		Rectangle first = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[1]")).getRect();
		System.out.println(first.getDimension());
		System.out.println(first.getPoint());
		System.out.println("------------------------");
		Rectangle second = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[2]")).getRect();
		System.out.println(second.getDimension());
		System.out.println(second.getPoint());
		System.out.println("------------------------");
		
		Thread.sleep(3000);
		Rectangle third = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[3]")).getRect();
		System.out.println(third.getDimension());
		System.out.println(third.getPoint());
		System.out.println("------------------------");
		
		Rectangle fourth = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[4]")).getRect();
		System.out.println(fourth.getDimension());
		System.out.println(fourth.getPoint());
		System.out.println("------------------------");
		
		Thread.sleep(3000);
		Rectangle fifth = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[5]")).getRect();
		System.out.println(fifth.getDimension());
		System.out.println(fifth.getPoint());
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
