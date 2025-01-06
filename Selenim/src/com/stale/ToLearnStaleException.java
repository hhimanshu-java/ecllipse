package com.stale;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnStaleException {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapp.skillrary.com/");
		WebElement search = d.findElement(By.id("navbar-search-input"));
		Thread.sleep(3000);
		search.sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(2000);
		search.sendKeys("TestNG");	
	}
}