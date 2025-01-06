package com.Popups;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ToLearnNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--start-maximized");
//		opt.addArguments("--disable-notifications")
		opt.addArguments("--incognito");
		opt.addArguments("--start-fullscreen");
		WebDriver d = new ChromeDriver(opt);
		d.manage().window().minimize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.myntra.com/");
	}

}
