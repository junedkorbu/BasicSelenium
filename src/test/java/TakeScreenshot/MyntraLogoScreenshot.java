package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogoScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		//Step 1 : Downcast takesSceenshot- to access  
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step 2 : call getScreendhotAs() and store in 
		File tempfile = driver.findElement(By.className("desktop-logoContainer")).getScreenshotAs(OutputType.FILE);
		
		//Step 3 : call the getAbsoultepath() to know the location of screenshot 
//		System.out.println(tempfile.getAbsoluteFile());
		
		//Create object of File and in file constructor pass the path of the folder(images)
		File desinationFile = new File("./MyntraLogo/Logo.png");
		
		//Move screenshot from temp location to destination location
//		tempfile.renameTo(desinationFile);
		FileUtils.copyFile(tempfile, desinationFile);
		
		driver.quit();
	}
}
