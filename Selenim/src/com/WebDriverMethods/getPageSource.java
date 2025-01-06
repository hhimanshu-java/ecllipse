package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		d.close();
	}

}
