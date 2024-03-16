package BasicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PantaloonsAssignment {

	public static void main(String []args) throws InterruptedException
	{
		ChromeDriver d = new ChromeDriver();
//		d.manage().window().fullscreen();
		d.get("https://www.pantaloons.com/");
		d.manage().window().maximize();
		
		WebElement search = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		search.sendKeys("Sunglasses");
		search.sendKeys(Keys.ENTER);
		
		d.findElement(By.xpath("(//img[@alt='Smoke Gradient Sunglasses'])[1]")).click();
//		d.navigate().refresh();
		Thread.sleep(4000);
		d.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiButton-root')])[2]")).click();
//		d.findElement(By.className("share-image")).click();
		
		Thread.sleep(4000);
		d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	}
}








