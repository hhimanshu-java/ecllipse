package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Contact uploading and non-users']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='search']")).sendKeys("FACEBOOK");	
	}
}