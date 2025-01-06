package com.Synchronization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnImpicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		d.findElement(By.id("loginBtn")).click();
		d.findElement(By.name("username")).sendKeys("prinshu_pndit");
		System.out.println(d.getCurrentUrl());
//		d.navigate().refresh();	
		
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.findElement(By.id("email")).sendKeys("himan.tiwari99@gmail.com");
		System.out.println(d.getCurrentUrl());
		
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.shoppersstack.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		d.findElement(By.id("loginBtn")).click();
		System.out.println(d.getCurrentUrl());
		
		Thread.sleep(3000);
		d.quit();
	}

}
