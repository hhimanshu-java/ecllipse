import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
public class ToLearnMouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.myntra.com/");
		WebElement men = d.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		Actions act = new Actions(d);
		act.moveByOffset(155,46).perform();
//		act.pause(Duration.ofSeconds(5));
		d.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
//		act.moveToElement(tshirt).perform();
//		tshirt.click();
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Myntra.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
//		WebElement home = d.findElement(By.partialLinkText("HOME & LIVING"));
//		act.moveToElement(home).perform();
	}

}
