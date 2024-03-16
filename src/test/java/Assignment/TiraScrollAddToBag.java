package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TiraScrollAddToBag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.tirabeauty.com/sections/offers?gad_source=1&gclid=CjwKCAiA29auBhBxEiwAnKcSqv8LzrMHe1MMw6CQ89TPF1os0stG8vcM4kRVMjlr9NVIk4fQRJSEoRoCI4sQAvD_BwE");
		
		WebElement freg = driver.findElement(By.linkText("Fragrance"));
		Actions a = new Actions(driver);
		a.moveToElement(freg);
		a.perform();
		
		driver.findElement(By.xpath("(//a[text()=' Deodorants & Roll-Ons '])[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    while (true) {
	    	try {
		    	driver.findElement(By.cssSelector("img[alt='Ajmal | Ajmal Mukhallat Raaqi Floral Fruity Attar And Khofooq Woody Oudhy Attar - (2Pcs)']")).click();
		    	break;
		    }catch(NoSuchElementException n)
		    {
		    	js.executeScript("window.scrollBy(0,500)");
		    }
		}
	    
	    Set<String> ids = driver.getWindowHandles();
	    
	    for(String id:ids)
	    {
	    	if((driver.switchTo().window(id).getCurrentUrl()).contains("https://www.tirabeauty.com/product/ajmal-mukhallat-raaqi-floral-fruity-attar-and-khofooq-woody-oudhy-attar---2pcs-vfvsuyoe8sn"))
	    	{
	    		break;
	    	}
	    }
	    
	    driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	}
}

