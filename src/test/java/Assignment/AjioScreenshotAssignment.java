package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioScreenshotAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAn-2tBhDVARIsAGmStVk2ZNPbN26dbh7UPXTYdIrg4idehq0p8ozmGgqz_A0q1ifDowAL4DAaAjRhEALw_wcB");
		
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[3]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a:ids)
		{
			if((driver.switchTo().window(a).getCurrentUrl()).contains("https://www.ajio.com/limestone-radd007-oval-dial-analogue-watch/p/466841731_silver"))
			{
				break;
			}
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[6]")).click();
		File temp0 = ts.getScreenshotAs(OutputType.FILE);
		File dest0 = new File("./AjioAssignment/s1.png");
		FileUtils.copyFile(temp0, dest0);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[7]")).click();
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./AjioAssignment/s2.png");
		FileUtils.copyFile(temp, dest);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[8]")).click();
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./AjioAssignment/s3.png");
		FileUtils.copyFile(temp1, dest1);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[9]")).click();
		File temp2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./AjioAssignment/s4.png");
		FileUtils.copyFile(temp2, dest2);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[10]")).click();
		File temp3 = ts.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("./AjioAssignment/s5.png");
		FileUtils.copyFile(temp3, dest3);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[11]")).click();
		File temp4 = ts.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("./AjioAssignment/s6.png");
		FileUtils.copyFile(temp4, dest4);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[12]")).click();
		File temp5 = ts.getScreenshotAs(OutputType.FILE);
		File dest5 = new File("./AjioAssignment/s7.png");
		FileUtils.copyFile(temp5, dest5);
		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[13]")).click();
//		File temp6 = ts.getScreenshotAs(OutputType.FILE);
//		File dest6 = new File("./AjioAssignment/s1.png");
//		FileUtils.copyFile(temp6, dest6);
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[14]")).click();
//		File temp7 = ts.getScreenshotAs(OutputType.FILE);
//		File dest7 = new File("./AjioAssignment/s1.png");
//		FileUtils.copyFile(temp7, dest7);
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("(//img[@alt='Product image of LIMESTONE RADD007 Oval Dial Analogue Watch'])[15]")).click();
//		File temp8 = ts.getScreenshotAs(OutputType.FILE);
//		File dest8 = new File("./AjioAssignment/s1.png");
//		FileUtils.copyFile(temp8, dest8);
		Thread.sleep(4000);
		
		driver.quit();
	}
}
