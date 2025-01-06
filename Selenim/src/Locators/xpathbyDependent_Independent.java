package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyDependent_Independent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/men");
		Thread.sleep(5000);
//		d.findElement(By.xpath("//label[text()='Good']/..//input[@id='pollanswers-2']")).click();
//		String url = d.getCurrentUrl();
//		System.out.println(url);
//		Thread.sleep(7000);
//		d.quit();
		d.findElement(By.xpath("//span[text()='roadster']/../..//p[@span='₹']")).click();
		
	}

}
