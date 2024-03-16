package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException,InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 Thread.sleep(2000);
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File temp = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']")).getScreenshotAs(OutputType.FILE);
		 File dest = new File("./WebEle/Filter.png");
		 FileUtils.copyFile(temp, dest);
		 
		 driver.quit();
	}
}

