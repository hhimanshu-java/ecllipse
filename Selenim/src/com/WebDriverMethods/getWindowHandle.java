package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
		System.out.println(d.getWindowHandle());
		Thread.sleep(3000);
		d.close();
	}
}