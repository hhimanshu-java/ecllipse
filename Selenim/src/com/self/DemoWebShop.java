package com.self;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
public class DemoWebShop {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./Test Data/demoshop.properties");
		Properties prop = new Properties();
		prop.load(fis);
	    System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("FN"));
		System.out.println(prop.getProperty("LN"));	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver d = new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demowebshop.tricentis.com/register");
		d.findElement(By.id("gender-male")).click();
		d.findElement(By.id("FirstName")).sendKeys(prop.getProperty("FN"));
		d.findElement(By.id("LastName")).sendKeys(prop.getProperty("LN"));
		d.findElement(By.id("Email")).sendKeys(prop.getProperty("Email"));
		d.findElement(By.id("Password")).sendKeys(prop.getProperty("pass"));
		d.findElement(By.id("ConfirmPassword")).sendKeys(prop.getProperty("cpass"));
		d.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		File temp = d.findElement(By.xpath("//li[text()='The specified email already exists']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/errormsg.png");
		FileHandler.copy(temp, dest);
	}
}