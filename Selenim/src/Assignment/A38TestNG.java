package Assignment;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class A38TestNG {
		@Test
		public void main() {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			d.get("http://automationexercise.com/");
			WebElement home = d.findElement(By.linkText("Home"));
     		boolean homepage = home.isDisplayed();
     		Reporter.log("IS HOMEPAGE IS DISPLAYED:- " + homepage, true);
     		WebElement contactus = d.findElement(By.linkText("Contact us"));
     		contactus.click();
     		WebElement GIT = d.findElement(By.xpath("//h2[text()='Get In Touch']"));
     		System.out.println(GIT.isDisplayed());
     		d.findElement(By.name("name")).sendKeys("HIMANSHU TIWARI");
     		d.findElement(By.name("email")).sendKeys("himan.tiwari99@gmail.com");
     		d.findElement(By.name("subject")).sendKeys("SELENIUM AUTOMATION W.R.T. JAVA");
     		d.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/devops/Downloads/RESUME.pdf");
     		d.findElement(By.name("submit")).click();
     	    Alert popup = d.switchTo().alert();
     	    popup.accept();
     	    WebElement successmsg = d.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]"));
     	    System.out.println("IS SUCCESS MESSAGE IS DISPLAYED :- " + successmsg.isDisplayed()); 
     	    WebElement homebtn = d.findElement(By.xpath("//span[text()=' Home']"));
     	    homebtn.click();
     	    WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
     	    Boolean HPage = w.until(ExpectedConditions.urlContains("https://automationexercise.com/"));
     	    System.out.println("IS HOMEPAGE IS DISPLAYED :- " + HPage);
		}
}
