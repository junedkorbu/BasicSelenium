package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykaaAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gad_source=1&gclid=CjwKCAiA8YyuBhBSEiwA5R3-E6TPNnR3SVQ-uaXFlvP2q9SOmKnnMZ47MtAH8HKZJV8jfTzvzY8RnRoCp3cQAvD_BwE");
		
		WebElement search = d.findElement(By.name("search-suggestions-nykaa"));
		search.sendKeys("Perfumes");
		search.sendKeys(Keys.ENTER);
		
		d.findElement(By.cssSelector("img[alt='Bella Vita Luxury Perfumes Gift Set For Women']")).click();
		
		d.findElement(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Rs. 500 - Rs. 999']")).click();
	}
}
