package com.LocatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		d.findElement(By.id("FirstName")).sendKeys("Prinshu");
		Thread.sleep(2000);
		d.findElement(By.id("LastName")).sendKeys("Tiwari");
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("himan.tiwari99@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("Password")).sendKeys("8707790281");
		Thread.sleep(2000);
		d.findElement(By.id("ConfirmPassword")).sendKeys("8707790281");
		Thread.sleep(2000);
		d.findElement(By.id("register-button")).click();
		Thread.sleep(7000);
		d.close();
	}

}
