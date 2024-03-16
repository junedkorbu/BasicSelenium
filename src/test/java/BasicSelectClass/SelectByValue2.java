package BasicSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue2 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		//Step 1 : Identify targated Webelement- Month
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		//Step 2 : Create the Object of select class
		//Step 3 : Select Counstructor pass targeted webELement as an argument
		Select s = new Select(country);
		
		//Step 4 : Call the non static methods 
		System.out.println(s.getOptions());
		
		s.selectByValue("Saudi Arabia");
		
		List<WebElement> countries = s.getOptions();
		
		int count =0;
		for(WebElement a:countries)
		{
			System.out.println(a.getText());
			count++;
		}
		
		System.out.println();
		System.out.println("Total Countries : "+count);
		Thread.sleep(4000);
		driver.quit();
	}
}
