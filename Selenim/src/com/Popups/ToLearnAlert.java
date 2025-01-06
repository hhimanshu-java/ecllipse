package com.Popups;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//input[@value='Search']")).click();
		Alert popup = d.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(popup.getText());
		popup.dismiss();
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		d.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert pop = d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(pop.getText());
		Thread.sleep(5000);
		pop.accept();
		Thread.sleep(8000);
		d.quit();
	}

}
