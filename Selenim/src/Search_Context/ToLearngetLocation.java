package Search_Context;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Point l = d.findElement(By.xpath("//input[@value='Search store']")).getLocation();
		System.out.println(l.getX());
		System.out.println(l.getY());
		Thread.sleep(5000);
		d.quit();
	}

}
