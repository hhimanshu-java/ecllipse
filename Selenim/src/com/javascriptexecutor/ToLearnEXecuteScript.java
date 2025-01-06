package com.javascriptexecutor;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnEXecuteScript {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.get("https://demoapp.skillrary.com");
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0,500);");
	}

}
