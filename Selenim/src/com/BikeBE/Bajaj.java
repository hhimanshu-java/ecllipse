package com.BikeBE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bajaj {
		
	@Test(groups = "smoke")
	public void link() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		d.get("https://www.bajajauto.com/");
		Reporter.log("BAJAJ got executed", true);
	}
}
