package com.iframe;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearniframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.dream11.com/");
		WebElement frame = d.findElement(By.id("send-sms-iframe"));
		d.switchTo().frame(frame);
		d.findElement(By.id("regEmail")).sendKeys("87077");
		d.findElement(By.name("loginsubmit")).click();
		d.switchTo().parentFrame();
		d.findElement(By.id("hamburger")).click();
		d.findElement(By.xpath("(//a[text()='Fantasy Cricket'])[1]")).click();
		WebElement fframe = d.findElement(By.id("send-sms-iframe"));
		d.switchTo().frame(fframe);
		d.findElement(By.id("regEmail")).sendKeys("8700000");
		d.findElement(By.name("loginsubmit")).click();
		d.switchTo().parentFrame();
		d.findElement(By.id("hamburger")).click();
		d.findElement(By.xpath("(//a[text()='Fantasy Football'])[1]")).click();
		d.switchTo().frame(0);
		d.findElement(By.id("regEmail")).sendKeys("87077");
		d.findElement(By.name("loginsubmit")).click();
		d.switchTo().defaultContent();
		d.findElement(By.id("hamburger")).click();
		d.findElement(By.xpath("(//a[text()='Fantasy Sports'])[1]")).click();
		d.switchTo().frame("send-sms-iframe");
		d.findElement(By.id("regEmail")).sendKeys("8707777");
		d.findElement(By.name("loginsubmit")).click();
		d.switchTo().parentFrame();
		System.out.println(d.getCurrentUrl());
		Thread.sleep(5000);
		d.close();
		}

}
