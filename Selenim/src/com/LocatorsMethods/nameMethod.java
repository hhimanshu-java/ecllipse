package com.LocatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.findElement(By.name("email")).sendKeys("himan.tiwari99@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.name("pass")).sendKeys("8707790281");
		Thread.sleep(5000);
		d.close();
	}

}
