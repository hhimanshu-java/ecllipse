package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A21DemoWebShop {
	public static void main(String[] args) throws InterruptedException, IOException {
		String ts = LocalDateTime.now().toString().replace(":", "-");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@type='button']")).click();
		TakesScreenshot tk = (TakesScreenshot) d;
		WebElement successMsg = d.findElement(By.id("bar-notification"));
		w.until(ExpectedConditions.visibilityOf(successMsg));
		File temp = successMsg.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/popup" + ts + ".png");
		FileHandler.copy(temp, dest);
		w.until(ExpectedConditions.invisibilityOf(successMsg));
		d.findElement(By.xpath("//a[text()='Log in']")).click();
		File temp1 = tk.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/Login" + ts + ".png");
		FileHandler.copy(temp1, dest1);
		Thread.sleep(5000);
		d.close();
	}

}
