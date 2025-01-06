package Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class A22Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.freshersworld.com/");
		d.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("firstname")).sendKeys("PRINSHU");
		d.findElement(By.name("lastname")).sendKeys("TIWARI");
		d.findElement(By.id("email")).sendKeys("himanshu.99@gmail.com");
		d.findElement(By.id("pass")).sendKeys("himanSHU@000");
		d.findElement(By.id("mobile")).sendKeys("8707790281");
		WebElement city = d.findElement(By.id("currentCity"));
		Select C = new Select(city);
		C.selectByVisibleText("Delhi");
		C.deselectByVisibleText("Delhi");
		WebElement course = d.findElement(By.id("course"));
		Select cour = new Select(course);
		cour.selectByValue("14");
		cour.deselectByValue("14");
		Thread.sleep(5000);
		d.close();
	}

}
