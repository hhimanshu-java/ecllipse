package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();
		String url = d.getCurrentUrl();
		System.out.println(url);
	}

}
