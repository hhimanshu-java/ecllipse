package Search_Context;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnisSelected {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		WebElement RD = d.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']"));
		System.out.println(RD.isSelected());
		RD.click();
		System.out.println("=== AFTER CLICKING ===");
		System.out.println(RD.isSelected());
		TakesScreenshot tk = (TakesScreenshot)d;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("demowebshop.img");
		FileHandler.copy(source,dest);
		Thread.sleep(5000);
		d.close();
	}

}
