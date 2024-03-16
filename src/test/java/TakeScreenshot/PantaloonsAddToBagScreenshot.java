package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PantaloonsAddToBagScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
//		d.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		
		WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='MuiPaper-root MuiCard-root PlpWeb_product-card__1TKOq MuiPaper-elevation1 MuiPaper-rounded'])[2]")).click();
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp = driver.findElement(By.className("flex100")).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./PantaloonsWebElement/AddToBag.png");
		
		FileUtils.copyFile(temp, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
