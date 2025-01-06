package com.LocatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Mobiles",Keys.ENTER);
	}
}