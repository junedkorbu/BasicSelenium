package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelectRegion {

	public static void main(String[] args) throws InterruptedException {      
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=13522013506315416952&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062104&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		
		WebElement language = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(language);
		a.perform();
		
		Thread.sleep(2000);
		WebElement change = driver.findElement(By.xpath("//div[text()='Change country/region.']"));
		a.click(change);
		a.perform();
		
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.cssSelector("span[class='a-button-text a-declarative']"));
		Select s = new Select(dropdown);
		s.selectByValue("Canada");
		
		Thread.sleep(8000);
		driver.quit();
		
	}
}


