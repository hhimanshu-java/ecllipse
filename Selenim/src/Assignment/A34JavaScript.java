package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class A34JavaScript {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoapp.skillrary.com");
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("history.go()");
		Thread.sleep(3000);
		WebElement disabletext = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value='Hello Himanshu !!!!'", disabletext);	
		File temp = disabletext.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/javascript.png");
		FileHandler.copy(temp, dest);
	}
}