package com.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
//		WelcomePage w = new WelcomePage(driver);
//		w.getRegisterlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getLoginlink().click();
	}

}
