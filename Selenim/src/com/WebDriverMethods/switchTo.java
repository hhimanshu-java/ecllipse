package com.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		d.navigate().to("https://www.instagram.com/");
		d.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		d.get("https://www.whatsapp.com/");
		Thread.sleep(7000);
		d.quit();	
	}
}
