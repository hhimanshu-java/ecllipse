package com.Actions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToLearnDragandDrop {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement elem = d.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		Actions act = new Actions(d);
		d.switchTo().frame(elem);
		WebElement photo = d.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trash = d.findElement(By.id("trash"));
//		act.dragAndDrop(photo, trash).perform();
		act.clickAndHold(photo).perform();
		act.release(trash).perform();
		d.findElement(By.xpath("//h5[text()='High Tatras']/..//a[text()='View larger']")).click();
		d.switchTo().defaultContent();
		act.scrollByAmount(0, 340).perform();
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/drag.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		d.close();
	}

}
