package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWelcomePage {

	public static void main(String[] args) {
		WebDriver A = new ChromeDriver();
		A.get("https://www.amazon.in/");
		String title = A.getTitle();
		System.out.println(title);
		System.out.println();
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("User Navigated To Amazon Welcome Page");
		}
		else {
			System.out.println("User Failed To Navigate");
		}
  	}

}
