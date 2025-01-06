package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.shoppersstack.com/products_page/24");
		System.out.println(d.findElement(By.id("Check")).isEnabled());
		d.findElement(By.id("Check Delivery")).sendKeys("560078");
		WebElement check = d.findElement(By.id("Check"));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(check)).click();
		System.out.println(d.findElement(By.id("Check")).isEnabled());
//		check.click();
		String text = d.findElement(By.xpath("//p[text()='Not Deliveriable.']")).getText();
		System.out.println(text);
//		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
	}

}
