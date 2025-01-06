package com.self;

import java.time.LocalDateTime;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshotsss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(time);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://demowebshop.tricentis.com/");
		
		switchToWindow(d, "flipkart");
		
		}
		public static void switchToWindow(WebDriver d, String expurl) {
			Set<String> ID = d.getWindowHandles();
			for (String st : ID) 
			{
				d.switchTo().window(st);
				String acturl = d.getCurrentUrl();
				if (acturl.contains(expurl))
				{
					break;	
				}
			}
	}
}
