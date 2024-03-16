package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotificationPopup {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
//		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAiA_tuuBhAUEiwAvxkgThZs0KzFlBE5EetUJEWEvKaACaCZOPUCwlR9sccNjScQ83muYcY_2RoChe0QAvD_BwE");
		
		//Steps to avoid notification popup
		
		//Step 1 : Create object of chrome options class
		ChromeOptions co = new ChromeOptions();
		
		//Step 2 : Call Addargument(String arguments)
		co.addArguments("--disable-notifications");
		
		//Step 3 : We are passing refernce of chromeOptions classinto ChromeDriver constructor 
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAiA_tuuBhAUEiwAvxkgThZs0KzFlBE5EetUJEWEvKaACaCZOPUCwlR9sccNjScQ83muYcY_2RoChe0QAvD_BwE");
		
	}
}
