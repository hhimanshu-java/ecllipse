package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWelcomePage {

	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.get("https://www.myntra.com/");	
		String title = M.getTitle();
		System.out.println(title);
		System.out.println();
		String url = M.getCurrentUrl();
		System.out.println(url);
//		if (title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
//			System.out.println("User Navigated To Myntra Welcome Page");
//		}
//		else {
//			System.out.println("User Failed To Navigate");
//		}
	}

}
