package com.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		System.out.println();
		Dimension size = d.manage().window().getSize();
		System.out.println("HEIGHT IS : " + size.getHeight());
		System.out.println("WIDTH IS : " + size.getWidth());
		Thread.sleep(3000);
		d.close();
	}

}
