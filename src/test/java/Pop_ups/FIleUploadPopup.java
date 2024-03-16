package Pop_ups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("file_wraper0")).click();
		
		Thread.sleep(4000);
		
//		Runtime.getRuntime().exec("C:\\Users\\lenovo\\OneDrive\\Desktop\\HtmlUpload.exe");
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\OneDrive\\Desktop\\Mevan.exe");
	}
}



