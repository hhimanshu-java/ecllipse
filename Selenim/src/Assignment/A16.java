package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement search = d.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		System.out.print("IS SEARCH BUTTON PRESENT? : ");
		System.out.println(search.isDisplayed());
		Thread.sleep(3000);
		Rectangle size = d.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).getRect();
		System.out.println("X CO-ORDINATE IS : "+ size.getX());
		System.out.println("Y CO-ORDINATE IS : "+ size.getY());
		System.out.println("HEIGHT IS : "+ size.getHeight());
		System.out.println("WIDTH IS : "+ size.getWidth());
		System.out.print("IS SEARCH BUTTON ENABLED? : ");
		System.out.println(search.isEnabled());
		System.out.print("IS SEARCH BUTTIN SELECTED? :");
		System.out.println(search.isSelected());
		d.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");
		System.out.println("=== AFTER SELECTING SEARCH BUTTON ===");
		System.out.print("IS SEARCH BUTTIN SELECTED? :");
		System.out.println(search.isSelected());
		Thread.sleep(3000);
		d.close();
	}

}
