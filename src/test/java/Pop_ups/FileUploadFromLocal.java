package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadFromLocal {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='upfile']")).click();
		
		
	}
}
