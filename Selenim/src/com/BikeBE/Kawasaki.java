package com.BikeBE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki {
	@Test(groups = "regression")
	public void link() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		d.get("https://www.kawasaki-india.com/");
		Reporter.log("KAWASAKI got executed", true);
	}
}
