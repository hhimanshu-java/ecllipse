package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnrightClick {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(d);
//		act.contextClick().perform();
//		WebElement search = d.findElement(By.xpath("//input[@value='Search store']"));
//		act.contextClick(search).perform();
//		d.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Mobiles",Keys.ENTER);
//		d.navigate().refresh();
		WebElement link = d.findElement(By.xpath("//a[text()='Register']"));
		act.contextClick(link).perform();
	}

}
