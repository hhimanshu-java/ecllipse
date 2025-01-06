package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/");
		String SC = d.getPageSource();
		d.manage().window().maximize();
		System.out.println(SC);
		Thread.sleep(5000);
		d.close();
	}
}