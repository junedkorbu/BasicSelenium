package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		//Step 1 : Downcast TakesScreenshot 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step 2 : Call getScreenshotAs() and store sceenshot in File 
		File  tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3 : Crate a folder in project and create Object for file 
		File desimage = new File("./AutomateFolder/ajio1.jpg");
		
//		tempfile.renameTo(desimage);
		
		FileUtils.copyFile(tempfile, desimage);
		
		//After execution refresh the project
		
	}
}
