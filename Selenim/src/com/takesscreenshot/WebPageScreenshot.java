package com.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		String ts = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(ts);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		TakesScreenshot tk = (TakesScreenshot) d;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+ts+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		d.close();
	}

}
