package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		System.out.println(d.getTitle());
		System.out.println(d.manage().window().getSize());
		d.quit();
		
	}

}
