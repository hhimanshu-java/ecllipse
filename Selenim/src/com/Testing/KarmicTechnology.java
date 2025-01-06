package com.Testing;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class KarmicTechnology {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://karmictechnology.com/");
		Thread.sleep(2000);
//		d.findElement(By.xpath("//a[text()='Youtube']")).click();
	d.findElement(By.xpath("//a[text()='Tutorial']")).click();
		Set<String> allids = d.getWindowHandles();
		for (String s : allids) {
			System.out.println(s);
			d.switchTo().window(s);
			String url = d.getCurrentUrl();
			if (url.contains("compilersutra")) {
				break;
			}
	}
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("prinshu.tiwari99@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		String warning = d.findElement(By.xpath("//p[text()='You are already subscribed.']")).getText();
		System.out.println(warning);
		Thread.sleep(5000);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println(d.getWindowHandle());
		d.quit();
	}
}
