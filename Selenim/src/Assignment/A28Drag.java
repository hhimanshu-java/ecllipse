package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
public class A28Drag {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-adds");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame1 = d.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		d.switchTo().frame(frame1);
		WebElement photo1 = d.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement photo2 = d.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = d.findElement(By.id("trash"));
		Actions act = new Actions(d);
		act.dragAndDrop(photo1, trash).perform();
		act.dragAndDrop(photo2, trash).perform();
		d.switchTo().defaultContent();
		d.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
//		String pid = d.getWindowHandle();
		Set<String> Ids = d.getWindowHandles();
		for (String s : Ids) {
			d.switchTo().window(s);
			Thread.sleep(2000);
			String url = d.getCurrentUrl();
			if (url.contains("sql-cheat-sheet/")) {
				break;
			}
		}
		WebElement joins = d.findElement(By.xpath("(//img[@loading='lazy'])[2]"));
		act.scrollToElement(joins).perform();
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/SQL.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(10000);
		d.quit();
	}
}