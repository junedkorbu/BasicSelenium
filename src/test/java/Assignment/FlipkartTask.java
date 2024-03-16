package Assignment;

import java.io.File;
import java.io.IOException;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To launch the application
		driver.get("https://www.flipkart.com/");
		
		//To find the Search Textfield 
		WebElement searchTF = driver.findElement(By.name("q"));
		searchTF.sendKeys("Shoes");
		searchTF.sendKeys(Keys.ENTER);
		
		//To find the Shoes Webelement
		driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[2]")).click();
		
		//Switching the control from parent window to child window
		Set<String> ids = driver.getWindowHandles();
		
		for(String s:ids)
		{
			if((driver.switchTo().window(s).getCurrentUrl()).contains("https://www.flipkart.com/jqr-signature-sports-shoes-running-walking-lightweight-gym-stylish-men/p/itm1d93d5d82ea93?pid=SHOGUV2FGDGJF4XU&lid=LSTSHOGUV2FGDGJF4XUJLFH9K&marketplace=FLIPKART&q=Shoes&store=osp&srno=s_1_2&otracker=search&otracker1=search&fm=organic&iid=en_I-6dvB67dGQgcilbebR1adcEJdAL2ePYIMTrxisU8tVAZWkagSzMshNOwFF1khT-BKu3IytkD4ln6ipfHV4J-Q%3D%3D&ppt=hp&ppn=homepage&ssid=ftcmmw9uog0000001710230435352&qH=a60ba1a7a56c9e00"))
			{
				break;
			}
		}
		
		//Downcast to TakesScreenshot (For taking screenshot purpose) 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./FlipkartTaskShoes/ShoesWebPage.png");
		
		FileUtils.copyFile(temp, dest);
	}
}
