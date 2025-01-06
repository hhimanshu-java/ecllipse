package com.Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnFluentWait {

	public static void main(String[] args) throws IOException, InterruptedException {
		String ts = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(ts);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.shoppersstack.com/products_page/24");
		d.findElement(By.id("Check Delivery")).sendKeys("560078");
		WebElement check = d.findElement(By.id("Check"));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(check)).click();
		File temp = d.findElement(By.xpath("//p[text()='Not Deliveriable.']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/error" + ts + ".png");
		FileHandler.copy(temp, dest);
		FluentWait fw = new FluentWait(d);
		fw.withTimeout(Duration.ofSeconds(20));
		fw.pollingEvery(Duration.ofMillis(300));
		fw.until(ExpectedConditions.elementToBeClickable(check));
		System.out.println(d.getCurrentUrl());
		Thread.sleep(5000);
		d.close();
		}

}
