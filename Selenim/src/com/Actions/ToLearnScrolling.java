package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToLearnScrolling {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapp.skillrary.com/");
		WebElement scroll = d.findElement(By.xpath("//h3[text()='Latest Courses']"));
		Actions act = new Actions(d);
//		act.scrollToElement(scroll).perform();
//		act.scrollByAmount(0, 1500).perform();
		act.scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, 500).perform();
	}

}
