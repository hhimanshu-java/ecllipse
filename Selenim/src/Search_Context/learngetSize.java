package Search_Context;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learngetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Dimension size = d.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Thread.sleep(5000);
		Dimension s = d.findElement(By.xpath("//a[@class='nivo-imageLink']/..")).getSize();
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
		Thread.sleep(5000);
		d.quit();
	}

}
