package com.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnDisabledElement {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.oracle.com/in/java/technologies/downloads/");
		d.findElement(By.xpath("//a[text()='jdk-17.0.13_linux-aarch64_bin.tar.gz']")).click();
		WebElement disable = d.findElement(By.xpath("//a[text()='Download jdk-17.0.13_linux-aarch64_bin.tar.gz']"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", disable);
	}

}
