package BasicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
//		System.out.println(anchor);
		
		for(WebElement a:anchor)
		{
			System.out.println(a.getText());
		}
	}
}



