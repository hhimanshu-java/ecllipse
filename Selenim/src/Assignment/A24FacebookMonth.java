package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class A24FacebookMonth {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement mon = d.findElement(By.id("month"));
		Select month = new Select(mon);
		List<WebElement> text = month.getOptions();
//		String types = mon.getText();
//		ITERATING THROUGH MONTH.....
		for (WebElement M : text) {
//			month.selectByVisibleText();
			String Month = M.getText();
			Thread.sleep(500);
			month.selectByVisibleText(Month);		
			TakesScreenshot tk = (TakesScreenshot) d;
			File temp = tk.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/Month" + LocalDateTime.now().toString().replace(":", "-") + ".png");
			FileHandler.copy(temp, dest);
			System.out.println(Month);
		}
		Thread.sleep(5000);
		d.close();
	}
}