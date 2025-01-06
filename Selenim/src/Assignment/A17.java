package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A17 {

	public static void main(String[] args) throws InterruptedException, IOException {
		LocalDateTime ts = LocalDateTime.now();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles",Keys.ENTER);
		TakesScreenshot tk = (TakesScreenshot) d;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+ts+"png");
		FileHandler.copy(temp, dest);
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
	}
}
