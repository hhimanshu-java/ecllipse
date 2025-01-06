package com.LocatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByDependentIndependent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']")).click();
		Thread.sleep(5000);
		d.close();
	}

}
