package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.dream11.com/");
		WebElement frame = d.findElement(By.id("send-sms-iframe"));
		d.switchTo().frame(frame);
		d.findElement(By.id("regEmail")).sendKeys("87077");
		d.findElement(By.name("loginsubmit")).click();
		
	}

}
