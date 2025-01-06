package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetPageSource {

	public static void main(String[] args) {
		 WebDriver d = new ChromeDriver();
		 d.get("https://www.amazon.com/");
		 String SC = d.getPageSource();
		 System.out.println(SC);
	}

}
