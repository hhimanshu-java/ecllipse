package com.BikeBE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {

	@Test(groups = "system")
	public void link() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		d.get("https://www.yamaha-motor-india.com/");
		Reporter.log("YAMAHA got executed", true);
	}
}
