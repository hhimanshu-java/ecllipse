package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateForward {

	public static void main(String[] args) throws InterruptedException {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			d.navigate().back();
			Thread.sleep(2000);
			d.navigate().forward();
			Thread.sleep(3000);
			d.close();
	}

}
