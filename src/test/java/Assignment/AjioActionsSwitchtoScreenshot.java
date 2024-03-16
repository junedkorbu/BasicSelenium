package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjioActionsSwitchtoScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
		Actions a = new Actions(driver);
		a.moveToElement(men);
		a.perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Sunglasses & Frames')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='nameCls'])[1]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a1:ids)
		{
			if((driver.switchTo().window(a1).getCurrentUrl()).contains("https://www.ajio.com/voyage-men-uv-protected-round-sunglasses-3040mg3982/p/466285341_black"))
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./AjioGotobag/GotoBag.png");
//		temp.renameTo(destination);
		FileUtils.copyFile(temp, destination);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
