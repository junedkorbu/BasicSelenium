package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File  tempfile = ts.getScreenshotAs(OutputType.FILE);
    	File desimage = new File("./Myntra/HomePage.png");
    	FileUtils.copyFile(tempfile, desimage);
				
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("Perfume");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
//		File temp= driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).getScreenshotAs(OutputType.FILE);
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Myntra/Perfume.png");
		FileUtils.copyFile(temp, dest);
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		Thread.sleep(2000);
        File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Myntra/MensPerfume.png");
		FileUtils.copyFile(temp1, dest1);
		
		Thread.sleep(2000);
		driver.quit();	
	}
}
