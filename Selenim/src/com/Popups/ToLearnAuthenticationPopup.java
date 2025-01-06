package com.Popups;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnAuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
//		d.close();
	}
}