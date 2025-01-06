package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A20ExpicitWait 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		String ts = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(ts);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		d.get("https://www.shoppersstack.com/products_page/24");
		System.out.println("is 'CHECK' button is enabled :- " + d.findElement(By.id("Check")).isEnabled());
		d.findElement(By.id("Check Delivery")).sendKeys("560078");
		WebElement check = d.findElement(By.id("Check"));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(check)).click();
		System.out.println("is 'CHECK' button enabled now :- " + d.findElement(By.id("Check")).isEnabled());
//		check.click();
		String text = d.findElement(By.xpath("//p[text()='Not Deliveriable.']")).getText();
		System.out.println("ERROR MESSAGE IS :- " + text);
		File temp = d.findElement(By.xpath("//p[text()='Not Deliveriable.']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/error" + ts + ".png");
		FileHandler.copy(temp, dest);
		
//		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
	}

}
