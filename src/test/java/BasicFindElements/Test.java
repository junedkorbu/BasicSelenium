package BasicFindElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\lenovo\\OneDrive\\Documents\\FIndElements.html");
		
//		List<WebElement> a = driver.findElements(By.cssSelector("input[type='text']"));
		List<WebElement> a = driver.findElements(By.xpath("//input[@value='A' and not(@type='button')]"));
//		WebElement b = driver.findElement(By.)
		//ArrayList<String> l = new ArrayList<>();
//		l.add("Juned");
//		l.add("Password");
		
		String[] str = {" Juned"," Password"};
		
		int ct = 0;
		
		for(WebElement a1:a)
		{
			Thread.sleep(2000);
			a1.sendKeys(str[ct]);
			ct++;
		}
		
		
	}
}
