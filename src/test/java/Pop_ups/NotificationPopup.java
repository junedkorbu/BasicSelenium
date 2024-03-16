package Pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAiA_tuuBhAUEiwAvxkgThZs0KzFlBE5EetUJEWEvKaACaCZOPUCwlR9sccNjScQ83muYcY_2RoChe0QAvD_BwE");
		
		//Steps to handle notification popup
		
		Thread.sleep(6000);
		//Create the object of Robot class
		Robot r = new Robot();
		
		//To press key in the keyboard 
		r.keyPress(KeyEvent.VK_TAB);
		
		//to release 
		r.keyRelease(KeyEvent.VK_TAB);
		
		//To press key in the keyboard 
				r.keyPress(KeyEvent.VK_ENTER);
				
				//to release 
				r.keyRelease(KeyEvent.VK_ENTER);
				
		
		        //To press key in the keyboard 
//				r.keyPress(KeyEvent.VK_TAB);
//				
//				//to release 
//				r.keyRelease(KeyEvent.VK_TAB);
//				
//				//To press key in the keyboard 
//				r.keyPress(KeyEvent.VK_TAB);
//				
//				//to release 
//				r.keyRelease(KeyEvent.VK_TAB);
				
				
	}
}

