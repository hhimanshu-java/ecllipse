package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnisMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapp.skillrary.com/");
		WebElement list = d.findElement(By.id("cars"));
		Select plist = new Select(list);
		System.out.println(plist.isMultiple());
		Thread.sleep(3000);
		d.close();
	}

}
