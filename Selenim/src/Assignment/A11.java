package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		d.findElement(By.partialLinkText("Experience the")).click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(3000);
//		d.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		d.findElement(By.id("browserButton3")).click();
		stw(d, "SignUp");
		Thread.sleep(5000);
		d.findElement(By.id("username")).sendKeys("himan.pndit");
		d.findElement(By.id("email")).sendKeys("himan.tiwari@gmail.com");
		d.findElement(By.id("password")).sendKeys("himanSHU@000");
		Thread.sleep(15000);
		d.quit();
	}
	public static void stw(WebDriver d, String expurl)
	{
		Set<String> ID = d.getWindowHandles();
		for (String st : ID) {
			d.switchTo().window(st);
			String acturl = d.getCurrentUrl();
			if (acturl.contains(expurl)) {
				break;
			}
		}
		
	}
	}
