package BasicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAiA8YyuBhBSEiwA5R3-E24N-wXt4KGIS04zWjtBMYubA5pAWNrxbPy8zO2KlDcO0MTSD6XTrBoCpTUQAvD_BwE");
		d.manage().window().maximize();
		
		WebElement search = d.findElement(By.name("searchVal"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		d.findElement(By.xpath("(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[2]")).click();
		
		Set<String> ids = d.getWindowHandles();
		
		for(String a:ids)
		{
			if((d.switchTo().window(a).getCurrentUrl()).contains("https://www.ajio.com/lorenz-mk-4027r-analogue-watch-with-leather-strap/p/466010056_brown"))
			{
				break;
			}
		}
		
		System.out.println(d.getTitle());
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
//		Thread.sleep(5000);
//		d.quit();
	}
}
