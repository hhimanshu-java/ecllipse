package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		d.findElement(By.partialLinkText("Facebook")).click();
		
		stw(d, "nopCommerce");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
		
		stw(d, "/login/identify");
		Thread.sleep(3000);
		d.findElement(By.id("identify_email")).sendKeys("himan.tiwari99@gmail.com");
		String title = d.getTitle();
		System.out.println(title);
		Thread.sleep(7000);
		d.findElement(By.id("did_submit")).click();
		Thread.sleep(15000);
		d.quit();
	}
	public static void stw(WebDriver d, String expurl) {
		Set<String> ID = d.getWindowHandles();
		for (String st : ID) {
			d.switchTo().window(st);
			String acturl = d.getCurrentUrl();
			if (acturl.contains(expurl)) {
				break;
			}
	}
	}
}
