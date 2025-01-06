package com.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnNestedIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		d.switchTo().frame(0);
		d.findElement(By.id("email")).sendKeys("himans@gmail.com");
		d.findElement(By.id("password")).sendKeys("RAJAJI@1230");
		Thread.sleep(5000);
		d.close();
	}
}