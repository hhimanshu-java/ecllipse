package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		String title = d.getTitle();
		System.out.println(title);
		String url = d.getCurrentUrl();
		System.out.println(url);
		d.close();
	}

}
