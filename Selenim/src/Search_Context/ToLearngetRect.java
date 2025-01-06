package Search_Context;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetRect {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Rectangle posi = d.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println(posi.getX());
		System.out.println(posi.getY());
		System.out.println(posi.getHeight());
		System.out.println(posi.getWidth());
		d.quit();
	}

}
