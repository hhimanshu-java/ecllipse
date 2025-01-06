package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnpartialLinkText {

	public static void main(String[] args) {
		WebDriver  d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.partialLinkText("JEWELRY")).click();
	}

}
