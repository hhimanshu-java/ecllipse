package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_contains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("birju_pndit");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("8707790281");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='Log in']")).click();
		String url = d.getCurrentUrl();
		System.out.println(url);
		String title = d.getTitle();
		System.out.println(title);
//		Thread.sleep(15000);
//		d.quit();
	}

}
