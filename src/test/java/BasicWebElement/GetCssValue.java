package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        String css= driver.findElement(By.name("login")).getCssValue("border-left-color");
        System.out.println(css);
        
        driver.quit();
	}
}

