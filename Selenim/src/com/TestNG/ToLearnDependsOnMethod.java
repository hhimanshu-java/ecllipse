package com.TestNG;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ToLearnDependsOnMethod {

	@Test(priority = 1)
	public void register() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("demowebshop.tricentis.com/register");
		Reporter.log("Register TestCase Executed", true);
	}
	@Test(dependsOnMethods = "register")
//	@Test(priority = 2)
	public void login() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login TestCase Executed", true);
	}
}
