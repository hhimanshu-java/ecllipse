package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisadvantageofThread {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(10000);
		d.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		d.close();
	}

}
