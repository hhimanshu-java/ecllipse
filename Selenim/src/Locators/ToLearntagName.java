package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearntagName {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		List<WebElement> all = d.findElements(By.tagName("a"));
		System.out.println(all.size());
		for (WebElement w : all) {
			System.out.println(w);
		}
	}

}
