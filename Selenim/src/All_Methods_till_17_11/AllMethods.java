package All_Methods_till_17_11;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com/products_page/30");
		String PS = d.getPageSource();
//		String url = d.getCurrentUrl();
		Thread.sleep(5000);
//		System.out.println(url);
//		Thread.sleep(2000);
//		System.out.println(PS);
//		Thread.sleep(2000);
//		Dimension size = d.manage().window().getSize();
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
//		Thread.sleep(2000);
//		Point p = d.manage().window().getPosition();
//		System.out.println(p.getX());
//		System.out.println(p.getY());
//		Thread.sleep(3000);
//		d.navigate().back();
//		Thread.sleep(3000);
//		d.navigate().forward();
//		Thread.sleep(3000);
//		d.navigate().refresh();
//		Thread.sleep(3000);
//		d.manage().window().setSize(new Dimension(500,500));
//		Thread.sleep(3000);
//		d.manage().window().setPosition(new Point (100, 40));
//		Thread.sleep(7000);
//		d.findElement(By.id("compare")).click();
//		Thread.sleep(5000);
//		d.close();
//		String pid = d.getWindowHandle();
//		Set<String> ids = d.getWindowHandles();
//		for (String s : ids) {
//			d.switchTo().window(s);
//			Thread.sleep(10000);
//			String url = d.getCurrentUrl();
//			Thread.sleep(10000);
//			if (url.contains("ebay")) {
//				Point Position = d.manage().window().getPosition();
//				System.out.println(Position.getX());
//				System.out.println(Position.getY());
//				d.quit();
//			}
//		}
		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://www.instagram.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.facebook.com/");
		Thread.sleep(10000);
		d.quit();
	}

}
