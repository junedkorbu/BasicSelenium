package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
//		EdgeDriver d = new EdgeDriver();
		
		d.manage().window().maximize();
		
		//Launch the Website---Jio.com
		d.get("https://www.jio.com/");
		
		Thread.sleep(5000);
		//Search the element-Mobile & Perform action on the element- Click
		d.findElement(By.linkText("Mobile")).click();
		
		Thread.sleep(3000);
		//Search the element-True 5G & Perform action on the element- Click
		d.findElement(By.partialLinkText("True")).click();
		
		Thread.sleep(3000);
		//Search the element-JioFiber & Perform action on the element- Click\
		d.findElement(By.linkText("JioFiber")).click();
		
		Thread.sleep(3000);
		//Search the element-AirFiber & Perform action on the element- Click
		d.findElement(By.linkText("AirFiber")).click();
		
		Thread.sleep(3000);
		//Search the element-Buisness & Perform action on the element- Click
		d.findElement(By.linkText("Business")).click();
		
		Thread.sleep(3000);
		//Search the element-Devices & Perform action on the element- Click
		d.findElement(By.linkText("Devices")).click();
		
		Thread.sleep(3000);
		//Search the element-Apps & Perform action on the element- Click
		d.findElement(By.linkText("Apps")).click();
		
		Thread.sleep(3000);
		//Search the element-Support & Perform action on the element- Click
		d.findElement(By.linkText("Support")).click();
	}
}
