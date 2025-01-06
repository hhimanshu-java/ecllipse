package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/30");
		Thread.sleep(15000);
		d.findElement(By.id("compare")).click();
		Thread.sleep(7000);
		String pid = d.getWindowHandle();
		System.out.println(pid);
		Set<String> Ids = d.getWindowHandles();
		for (String s : Ids) {
			d.switchTo().window(s);
			Thread.sleep(10000);
			String url = d.getCurrentUrl();
			if (url.contains("ebay")) {
//		Dimension dim = new Dimension(500,500);
		d.manage().window().setSize(new Dimension(500,500));
//		Thread.sleep(5000);
//		d.quit();
			}
		}
	}
}