package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/login");
		d.findElement(By.id("Email")).sendKeys("himan.tiwari99@gmail.com");
		d.findElement(By.id("Password")).sendKeys("123456789");
		d.findElement(By.id("RememberMe")).click();		
	}

}
