package TakeScreenshot;

import java.time.LocalDateTime;

public class LocalDateAndTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		System.out.println(ldt.toString().replace(':', '-'));
	}
}
