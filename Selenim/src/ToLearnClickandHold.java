import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickandHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		d.findElement(By.id("password")).sendKeys("himanshu@000");
		WebElement show = d.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions act = new Actions(d);
		act.clickAndHold(show).perform();
		Thread.sleep(5000);
		act.release().perform();
		Thread.sleep(5000);
		d.close();
	}
}
