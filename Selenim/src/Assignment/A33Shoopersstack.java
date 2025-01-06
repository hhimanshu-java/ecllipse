package Assignment;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A33Shoopersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.shoppersstack.com/products_page/23");
		d.findElement(By.id("compare")).click();
//		swapping of flipkart window.......		
		stw(d, "flipkart");
		Point posi1 = d.manage().window().getPosition();
		System.out.println("POSITITON OF FLIPKART :- " + posi1);
		d.manage().window().setPosition(new Point(800, 250));		
//		swapping of ebay window.......	
		stw(d, "ebay");
		Point posi2 = d.manage().window().getPosition();
		System.out.println("POSITION OF EBAY :- " + posi2);
		d.manage().window().setPosition(new Point(10, 250));		
		Thread.sleep(5000);
		d.quit();		
	}
	public static void stw(WebDriver d , String expurl) throws InterruptedException {
		Set<String> allids = d.getWindowHandles();
		for (String s : allids) {
			d.switchTo().window(s);
			String url = d.getCurrentUrl();
			if (url.contains(expurl)) {
				Thread.sleep(5000);
				System.out.println(d.getTitle());
				System.out.println(d.getCurrentUrl());
				break;
			}
		}
	}
}