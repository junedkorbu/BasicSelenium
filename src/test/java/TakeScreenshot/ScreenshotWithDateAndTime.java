package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWithDateAndTime {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		LocalDateTime time = LocalDateTime.now();
		 String time1=time.toString().replace(':', '-');
		
		Thread.sleep(5000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File  tempfile = ts.getScreenshotAs(OutputType.FILE);
    	File desimage = new File("./MyntraWithTime/HomePage"+time1+".png");
    	FileUtils.copyFile(tempfile, desimage);
				
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("Perfume");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
//		File temp= driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).getScreenshotAs(OutputType.FILE);
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./MyntraWithTime/HomePage"+time1+".png");
		FileUtils.copyFile(temp, dest);
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		Thread.sleep(5000);
        File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./MyntraWithTime/HomePage"+time1+".png");
		FileUtils.copyFile(temp1, dest1);
		
		Thread.sleep(2000);
		driver.quit();	
		
		
	}
}
