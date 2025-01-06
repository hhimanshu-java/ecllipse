package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com");
		d.findElement(By.name("username")).sendKeys("birju_pndit");
		d.findElement(By.name("password")).sendKeys("123456789");
	}

}
