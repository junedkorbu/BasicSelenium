package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyMyTrip {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAiA_tuuBhAUEiwAvxkgThZs0KzFlBE5EetUJEWEvKaACaCZOPUCwlR9sccNjScQ83muYcY_2RoChe0QAvD_BwE");
		
		
	}
}
