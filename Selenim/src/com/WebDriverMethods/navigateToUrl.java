package com.WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigateToUrl {
	public static void main(String[] args) {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.navigate().to(new String("https://demowebshop.tricentis.com/"));
	}
}