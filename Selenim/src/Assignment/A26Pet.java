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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A26Pet {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		d.get("https://petdiseasealerts.org/forecast-map/#/");
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		d.findElement(By.id("montana")).click();
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[text()='Sign up']")).click();
		d.findElement(By.id("user")).sendKeys("prince.ttiwari@gmail.com");
		d.findElement(By.id("pass")).sendKeys("himanSHU@000");
		d.findElement(By.id("cpass")).sendKeys("himanSHU@000");
		d.findElement(By.id("firstName")).sendKeys("Himanshu");
		d.findElement(By.id("lastName")).sendKeys("Tiwari");
//		d.findElement(By.id("phone")).sendKeys("9919046608");
		WebElement user = d.findElement(By.id("user-type"));
		Select dd = new Select(user);
		dd.selectByValue("4");
		d.findElement(By.xpath("//label[@for='accept-tou']/..//input[@type='checkbox']")).click();
		d.findElement(By.xpath("//button[text()='Sign Up']")).click();
		System.out.println(d.findElement(By.xpath("//b[text()='Thank you for registering!']/..")).getText());
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Pet.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		d.close();
	}
}