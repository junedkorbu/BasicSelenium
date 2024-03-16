package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=9461387018370270326&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062094&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Watches");
//		Thread.sleep(3000);
		search.clear();
		
	}
}
