package Assignment;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A36TestScript {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demowebshop.tricentis.com/");
		A36WlcmPage A = new A36WlcmPage(d);
		A.getRegisterlink().click();
	}
}