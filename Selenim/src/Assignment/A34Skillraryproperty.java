package Assignment;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A34Skillraryproperty {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./Test Data/A34skillrary.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("mainurl");
		System.out.println(url);
		String user = prop.getProperty("username");
		System.out.println(user);
		String pass = prop.getProperty("password");
		System.out.println(pass);	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(2));
		d.get(prop.getProperty("mainurl"));
		d.findElement(By.xpath("//a[text()='LOGIN']")).click();
		d.findElement(By.id("email")).sendKeys(user);
		d.findElement(By.id("password")).sendKeys(pass);
		d.findElement(By.id("last")).click();
		Thread.sleep(5000);
		Boolean page = w.until(ExpectedConditions.urlContains("admin/home.php"));
		System.out.println("IS HOMEPAGE IS DISPLAYED :- " + page);
		Thread.sleep(5000);
		d.close();		
	}
}