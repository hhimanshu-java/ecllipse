package com.Popups;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ToLearnHiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		d.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8707790281");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		d.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(2000);
		WebElement month = d.findElement(By.xpath("(//span[@role='button'])[2]"));	
		Actions act = new Actions(d);
		act.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		while (true) {
		try {
		d.findElement(By.xpath("//div[text()='October 2025']/../..//p[text()='18']")).click();
		break;
		}
		catch (Exception e) {
			month.click();
		}
		}
		Thread.sleep(5000);
		d.close();
	}
}
