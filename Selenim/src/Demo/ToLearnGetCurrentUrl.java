package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
		String url = d.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.instagram.com/")) {
			System.out.println("User is able to Navigate Successfully");
		}
		else {
			System.out.println("User is not able to Navigate");
		}
	}
}