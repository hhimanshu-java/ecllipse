package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnlinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("himan.tiwari99@gmail.com");
		d.findElement(By.id("Password")).sendKeys("123456789");
		d.findElement(By.id("RememberMe")).click();	
		Thread.sleep(3000);
		d.findElement(By.linkText("Log in")).click();

	}

}
