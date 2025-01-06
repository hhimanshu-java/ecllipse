package Assignment;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
     	d.manage().window().maximize();
     	d.get("https://www.redbus.com/");
		System.out.println(d.getCurrentUrl());
		Dimension size = new Dimension(600,900);
		d.manage().window().setSize(size);
		Thread.sleep(5000);
		d.manage().window().setSize(new Dimension(750,900));
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		Thread.sleep(5000);
		String ID = d.getWindowHandle();
		System.out.println(ID);
		d.close();
	}
}