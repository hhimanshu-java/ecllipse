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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
public class A31AbhiBus2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.abhibus.com/");
		d.findElement(By.xpath("(//div[@class='input-prefix col auto'])[3]")).click();
		WebElement month = d.findElement(By.xpath("//span[@class='calender-month-change']"));
		Actions act = new Actions(d);
		act.scrollByAmount(0, 200).perform();
		while (true) {
			try {
				d.findElement(By.xpath("//span[text()='March']/../../..//span[text()='10']")).click();
				break;
			} 
			catch (Exception e) {
				month.click();
			}	
		}
		TakesScreenshot ts =(TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Abhibus.png");
		FileHandler.copy(temp, dest);
		
		File tempo = d.findElement(By.xpath("(//div[@class='container form-control  '])[3]")).getScreenshotAs(OutputType.FILE);
		File desti = new File("./Screenshot/abhi.png");
		FileHandler.copy(tempo, desti);
		Thread.sleep(5000);
		d.close();
	}
}