package BasicWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
//		d.manage().window().maximize();
//		Thread.sleep(3000);
//		d.manage().window().minimize();
//		Thread.sleep(3000);
//		d.manage().window().fullscreen();
		
		
//		Dimension size = d.manage().window().getSize();
//		System.out.println(size);
//		System.out.println(size.getWidth());
//		System.out.println(size.getHeight());
		
		
		//To set the height and width of the window
//		Dimension set = new Dimension(1400,700);
//		d.manage().window().setSize(set);
		
		//To get the X and Y position
		Point p = d.manage().window().getPosition();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//To set the X and Y position
		Point setPosi = new Point(-10,-30);
		d.manage().window().setPosition(setPosi);
		
		System.out.println(d.getPageSource());
		
		Thread.sleep(5000);
		d.quit();
	}
}








