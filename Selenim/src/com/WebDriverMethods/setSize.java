package com.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
//		d.manage().window().setSize(new Dimension(500, 500));
		Dimension size = new Dimension(544, 500);
		d.manage().window().setSize(size);
		Dimension s = d.manage().window().getSize();
		System.out.println("new HEIGHT IS : " + s.getHeight());
		System.out.println("new WIDTH IS : " + s.getWidth());
		Thread.sleep(5000);
		d.close();
	}

}
