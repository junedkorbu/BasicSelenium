package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraSelectAddtobag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Watch");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
//		js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.cssSelector("div[class='brand-more']")).click();
		
		WebElement apple = driver.findElement(By.xpath("//label[contains(text(),'ALLORO')]"));
		
		Actions a = new Actions(driver);
		a.click(apple);
		
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		
        Set<String> ids = driver.getWindowHandles();
		
        for(String x:ids)
        {
        	if((driver.switchTo().window(x).getCurrentUrl()).contains("https://www.myntra.com/watches/roadster/roadster-men-black-analogue-watch/2280538/buy"))
        	{
        		break;
        	}
        }
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();                 
	}
}
