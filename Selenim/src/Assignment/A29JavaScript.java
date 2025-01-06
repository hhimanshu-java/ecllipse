package Assignment;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A29JavaScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.w3schools.com/js/js_popup.asp");
		d.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		Set<String> all = d.getWindowHandles();
		for (String string : all) {
			d.switchTo().window(string);
			Thread.sleep(2000);
			String url = d.getCurrentUrl();
			if (url.contains("js/tryit.asp?filename=tryjs_alert")) {
				break;
			}
		}
		WebElement frame = d.findElement(By.id("iframeResult"));
		d.switchTo().frame(frame);
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert pop = d.switchTo().alert();
		System.out.println(pop.getText());
		Thread.sleep(3000);
		pop.accept();
		Thread.sleep(7000);
		d.quit();
	}

}
