package BasicWebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		boolean search = driver.findElement(By.name("searchVal")).isEnabled();
		System.out.println(search);
		
//		boolean wishlist = driver.findElement(By.cssSelector("img[alt='Wishlist icon']")).isEnabled();
//		System.out.println(wishlist);
		
		WebElement s1= driver.findElement(By.name("searchVal"));
		s1.sendKeys("Shoes");
		s1.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[2]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String a:ids)
		{
			if((driver.switchTo().window(a).getTitle()).contains("Buy White Sports Shoes for Women by NIKE Online | Ajio.com"))
			{
				break;
			}
		}
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		boolean addToBag = driver.findElement(By.className("btn-gold")).isEnabled();
		System.out.println(addToBag);
		
		boolean addToBag1 = driver.findElement(By.className("btn-gold")).isSelected();
		System.out.println(addToBag1);
		
		 driver.findElement(By.xpath("//span[text()='4']")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.className("btn-gold")).click();
		 
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("div[class='btn-cart ']")).click();
		 
		 Thread.sleep(4000);
		 boolean radio = driver.findElement(By.id("FREESHIP")).isSelected();
		 System.out.println("Status of radio button : "+radio);
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}

