package com.Actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ToLearnDoubleClick {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		WebElement yes = d.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		Actions act = new Actions(d);
		act.doubleClick(yes).perform();
		WebElement btn = d.findElement(By.id("btn27"));
		act.doubleClick(btn).perform();
		}

}
