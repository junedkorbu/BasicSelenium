package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthancitaionPopup {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			driver.get("https://the-internet.herokuapp.com/basic_auth");
			
			Thread.sleep(2000);
//			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			driver.get("https://the-internet.herokuapp.com/basic_auth");
		}
}




