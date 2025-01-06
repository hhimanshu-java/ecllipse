package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		Thread.sleep(2000);
		d.findElement(By.name("username")).sendKeys("8707790281"); 
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("8707790281");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(7000);
		d.close();
	}

}
