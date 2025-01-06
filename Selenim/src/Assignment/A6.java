package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://makemytrip.com/");
		String url = d.getCurrentUrl();
		System.out.println(url);
		d.quit();
	}
}
