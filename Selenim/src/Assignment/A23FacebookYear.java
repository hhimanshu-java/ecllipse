package Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class A23FacebookYear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement year = d.findElement(By.id("year"));
		Select Y = new Select(year);
		int index = Y.getOptions().size()-1;
		Y.selectByIndex(index);
		Thread.sleep(5000);
		d.close();
	}
}