package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d = new ChromeDriver();
		 d.get("https://www.facebook.com/");
		 String title = d.getTitle();
		 System.out.println(title);
		 Thread.sleep(10000);
		 d.close();
	}

}
