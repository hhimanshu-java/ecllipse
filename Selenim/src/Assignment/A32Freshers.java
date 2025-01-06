package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A32Freshers 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.freshersworld.com/");
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		Boolean webpage = w.until(ExpectedConditions.urlContains("freshersworld"));
		System.out.println("IS WEBPAGE IS COMING :- " + webpage);
		d.findElement(By.id("reg_new_btn")).click();
		Actions act = new Actions(d);
		act.scrollByAmount(0, 400).perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/devops/Downloads/RESUME.pdf");		
		File temp = d.findElement(By.id("file-upload")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Freshers.png");
		FileHandler.copy(temp, dest);		
//		d.switchTo().newWindow(WindowType.TAB);
//		d.get("https://web.whatsapp.com/");
		Thread.sleep(5000);
//		d.quit();
	}

}
