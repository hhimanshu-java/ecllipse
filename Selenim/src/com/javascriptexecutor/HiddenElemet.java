package com.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElemet {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/reg");
		WebElement hidden = d.findElement(By.id("custom_gender"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].value='have a great day !!!!'", hidden);
		
	}	
}
