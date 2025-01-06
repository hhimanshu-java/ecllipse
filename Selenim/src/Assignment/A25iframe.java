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
public class A25iframe {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frame = d.findElement(By.id("iframeResult"));
		d.switchTo().frame(frame);
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		d.switchTo().alert().sendKeys("Himanshu Tiwari");
		d.switchTo().alert().accept();
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Iframe"+LocalDateTime.now().toString().replace(":", "-" ) + ".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		d.close();
		}
}