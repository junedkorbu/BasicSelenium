package BasicSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062099%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAiArLyuBhA7EiwA-qo80HsrokNcsOZ3WyrX8ILu1qTbKHWnLg8s1WphiLApE0MpXmZBPhO51hoC4hIQAvD_BwE");
			
			//Step 1 : Identify targated Webelement- Month
			WebElement month = driver.findElement(By.id("month"));
			
			//Step 2 : Create the Object of select class
			//Step 3 : Select Counstructor pass targeted webELement as an argument
			Select s = new Select(month);
			
			//Step 4 : Call the non static methods 
			System.out.println(s.getOptions());
			s.selectByIndex(5);
			
			List<WebElement> all = s.getOptions();	
			
			for(WebElement a:all)
			{
				System.out.println(a.getText());
			}
			
			Thread.sleep(4000);
			driver.quit();
		}
	
}
