package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn_quit {

	public static void main(String[] args) throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Instagram")).click();
		Thread.sleep(5000);
		d.quit();
	}
}