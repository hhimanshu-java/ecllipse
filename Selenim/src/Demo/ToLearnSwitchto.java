package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(7000);
		d.findElement(By.id("compare")).click();
		String pid = d.getWindowHandle();
//		capture all window ids.
		Set<String> ids = d.getWindowHandles();
//		navigate through all windows.
		for (String s : ids) {
			d.switchTo().window(s);
			Thread.sleep(10000);
			String url = d.getCurrentUrl();
//			if (!url.equals("https://www.shoppersstack.com/products_page/23")) {
//				d.close();
//			}
//					ORRRRRRR
			if (url.contains("flipkart")) {
				Point p = d.manage().window().getPosition();
				System.out.println(p.getX());
				System.out.println(p.getY());
				d.manage().window().setPosition(new Point(400, 250));
			
			}
			if(url.contains("amazon")) {
				d.manage().window().setPosition(new Point(10,250));
			}
//			else if(url.equals("https;//www.flipkart.com/")) {
//				d.close();
//			}
//			else if(url.equals("https://www.ebay.com/")) {
//				d.close();
//			}
			System.out.println(url);
		}
//d.quit();
		
	}

	
}
