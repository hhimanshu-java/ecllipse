package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.shoppersstack.com/products_page/23");
		d.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement check = d.findElement(By.id("Check"));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
	}

}
