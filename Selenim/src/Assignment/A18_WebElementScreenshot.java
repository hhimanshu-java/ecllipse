package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A18_WebElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(time);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.vtiger.com/vtigercrm/index.php?");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='forgot password?']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("fusername")).sendKeys("prinshu_pndit");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("himanshu.tiwari@99gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Submit']")).submit();
		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) d;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/A17"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(10000);
		d.close();
	}

}
