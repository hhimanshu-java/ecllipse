package com.self;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.manage().window().minimize();
		System.out.println(d.getTitle());
		d.close();
	}

}