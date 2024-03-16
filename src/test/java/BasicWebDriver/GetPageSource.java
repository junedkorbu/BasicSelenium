package BasicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		
		System.out.println(d.getPageSource());
	}
}
