package com.self;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) {
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://web.whatsapp.com/");
	}

}
