package Assignment;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerAssgnment {
	
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			// TODO Auto-generated method stub
			WebDriver c= new ChromeDriver();
			c.manage().window().maximize();
			c.get("https://demo.vtiger.com/vtigercrm/");
			Thread.sleep(3000);
			c.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(2000);
			c.findElement(By.id("appnavigator")).click();
			
			Thread.sleep(2000);
			WebElement line=c.findElement(By.xpath("//span[text()=' MARKETING']"));
			Actions a=new Actions(c);
			a.moveToElement(line);
			a.perform();
			
			Thread.sleep(2000);
			c.findElement(By.xpath("//span[text()=' Contacts']")).click();
			
			Thread.sleep(2000);
			
			c.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
			
			Thread.sleep(2000);
			JavascriptExecutor js= (JavascriptExecutor) c;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			Thread.sleep(2000);
			c.findElement(By.cssSelector("div[class='fileUploadBtn btn btn-primary']")).click();
			
			Thread.sleep(1000);
			Runtime.getRuntime().exec("C:\\Users\\21vai\\OneDrive\\Desktop\\Automation Tool Files\\Ass230224\\Ass230224.exe");
			
			Thread.sleep(1000);
			c.findElement(By.xpath("//button[text()='Save']")).click();
		
			Thread.sleep(8000);
			c.quit();


	}
}
