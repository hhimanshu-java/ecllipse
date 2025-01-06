package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Register")).click();
		String url = d.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://demowebshop.tricentis.com/register")) {
			System.out.println("Navigation Passed");
		}
		else {
			System.out.println("Navigation Failed");
		}
		d.findElement(By.id("gender-male")).click();
		d.findElement(By.id("FirstName")).sendKeys("HIMANSHU");
		d.findElement(By.id("LastName")).sendKeys("TIWARI");
		d.findElement(By.id("Email")).sendKeys("prinshu.tiwari99@gmail.com");
		d.findElement(By.id("Password")).sendKeys("himanSHU@000");
		d.findElement(By.id("ConfirmPassword")).sendKeys("himanSHU@000");
//		d.findElement(By.id("Register")).click();
	}

}
