package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDoggle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://doodles.google/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--next interactive']")).click();
		
//		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--prev interactive']")).click();
		
	}
}
