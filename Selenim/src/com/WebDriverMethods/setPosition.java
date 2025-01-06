package com.WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
//		d.manage().window().setPosition(new Point(10,20));
		Point axis = new Point(10,10);
		d.manage().window().setPosition(axis);
		System.out.println("new X IS : " + axis.getX());
		System.out.println("new Y IS : " + axis.getY());
		Thread.sleep(3000);
		d.close();
	}

}
