package com.TestNG;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ToLearnTestNG {
	@Test(priority = 3)
	public void sample() {
		Reporter.log("JAI BAJRANG BALI", true);
	}
	
	@Test(priority = 2)
	public void demo() {
		Reporter.log("Demo TestCase Executed", true);
	}
	
	@Test(enabled = false)
	public void register() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register TestCase Executed", true);
	}
	
	@Test(priority = 1, invocationCount = 4, threadPoolSize = 4, enabled = false)
	public void login() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login TestCase Executed", true);
	}
}
