package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.redbus.in/");
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[text()='Train Tickets']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//p[text()='Check PNR Status']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='12958 SWRAN J RAJDHANI']/../..//button[text()='Show Availability'][1]")).click();
		System.out.println(d.getTitle());
//		System.out.println(d.getCurrentUrl());
		Thread.sleep(15000);
		d.close();
	}

}
