package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_contains_text {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text() ,'Instagram from Meta')]")).click();
		Thread.sleep(10000);
		d.quit();
	}
}
