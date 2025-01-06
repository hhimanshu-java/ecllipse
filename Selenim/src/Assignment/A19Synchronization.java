package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class A19Synchronization {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shoppersstack.com");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.xpath("//span[text()='Men Regular Fit Solid Cut Away Collar ...']/../..//button[text()='add to cart']")).click();		
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("himanshu99@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("Password")).sendKeys("8707790281");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+ts+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(7000);
		d.close();
	}
}