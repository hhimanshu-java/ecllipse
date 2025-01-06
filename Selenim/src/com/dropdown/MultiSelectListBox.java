package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoapp.skillrary.com/");
		WebElement msl = d.findElement(By.id("cars"));
		Select l = new Select(msl);
		l.selectByValue("199");
		l.selectByIndex(0);
		l.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		Thread.sleep(5000);
		d.close();
	}

}
