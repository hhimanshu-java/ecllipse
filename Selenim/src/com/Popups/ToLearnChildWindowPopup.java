package com.Popups;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.shoppersstack.com/products_page/23");
		d.findElement(By.id("compare")).click();
		
		stw(d, "amazon");
		
		Thread.sleep(5000);
		d.quit();	
	}
	public static void stw(WebDriver d, String expurl) {
		Set<String> allids = d.getWindowHandles();
		for (String s : allids) {
			d.switchTo().window(s);
			String urls = d.getCurrentUrl();
			if (urls.contains(expurl)) {
				Point posi = d.manage().window().getPosition();
				d.manage().window().maximize();
				d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
				System.out.println(posi);
				break;
			}
		}
	}
}