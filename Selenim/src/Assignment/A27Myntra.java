package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A27Myntra {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--notifications--");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		d.get("https://www.myntra.com/");
		WebElement kids = d.findElement(By.partialLinkText("KIDS"));
		Actions act = new Actions(d);
		act.moveToElement(kids).perform();
		WebElement sandals = d.findElement(By.xpath("(//a[text()='Sandals'])[1]"));
		w.until(ExpectedConditions.visibilityOf(sandals));
		act.moveToElement(sandals).perform();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/A26.png");
		FileHandler.copy(temp, dest);
		sandals.click();
		Boolean url = w.until(ExpectedConditions.urlContains("kids-footwear?f=Categories%3ASandals"));
		System.out.println("IS Sandals page is present:- " + url);
		Thread.sleep(5000);
		d.close();
	}
}