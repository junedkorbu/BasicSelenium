package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
//		RemoteWebDriver d = new EdgeDriver();
		//Launch the application 
		d.get("https://letcode.in/test");
		
		d.manage().window().maximize();
		
		//To search the element- Sign up button & perform click action 
		d.findElement(By.linkText("Sign up")).click();
		
		//To search single element-name textfield & perform action- enter name
		d.findElement(By.id("name")).sendKeys("Juned Korbu");
		
		Thread.sleep(2000);
		//To search single element-eamil textfield & perform action- enter email
		d.findElement(By.id("email")).sendKeys("junedkorbu@gmail.com");
		
		Thread.sleep(2000);
		//To search single element-Password textfield & perform action- enter Password
		d.findElement(By.id("pass")).sendKeys("Junedkorbu@786");
		
		Thread.sleep(2000);
		//To search single element-CheckBox & perform action- enter name
		d.findElement(By.id("agree")).click();
		
		Thread.sleep(2000);
//		d.findElement(By.xpath("//button[@class='button is-primary']")).click();
		
		d.findElement(By.xpath("//button[text()='SIGN UP']")).click();
	}
}



