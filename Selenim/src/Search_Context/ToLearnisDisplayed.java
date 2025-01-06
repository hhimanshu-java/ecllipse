package Search_Context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		Thread.sleep(5000);
		WebElement button = d.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("himan_pndt");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("8707790281");
		System.out.println("=== AFTER SENDING DATA ===");
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		System.out.println(button.isSelected());
	}

}
