package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		d.manage().window().maximize();
		String url = d.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		d.manage().window().minimize();
		d.quit();
	}

}
