package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
//		d.get("https://demowebshop.tricentis.com/login");
//		d.findElement(By.xpath("//input[@value='true']")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(4000);
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Meta']")).click();
		String url = d.getCurrentUrl();
		System.out.println(url);
	}

}
