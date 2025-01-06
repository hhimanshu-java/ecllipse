package com.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		String ts = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(ts);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		File temp = d.findElement(By.xpath("//img[@class='nivo-main-image']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/photo" + ts + ".png");
		FileHandler.copy(temp, dest);
	}

}
