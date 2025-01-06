package com.Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeranFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.naukri.com/registration/createAccount");
		Actions act = new Actions(d);
		act.scrollByAmount(0, 600).perform();
		d.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		d.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/devops/Downloads/RESUME.pdf");
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@class='uploaded-resume']/..//img")).click();
		Thread.sleep(5000);
		d.close();
	}
}
