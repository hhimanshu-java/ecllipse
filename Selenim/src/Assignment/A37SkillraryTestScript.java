package Assignment;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class A37SkillraryTestScript {
	public static void main(String[] args) throws Exception{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("./Test Data/skillrary.properties");
		Properties prop = new Properties();
		prop.load(fis);
		d.get(prop.getProperty("url"));
		A37SkillraryWlcmPage wp = new A37SkillraryWlcmPage(d);
		wp.getLoginlink().click();
		A37SkillraryLoginPage lp = new A37SkillraryLoginPage(d);
		lp.getEmailtextfield().sendKeys(prop.getProperty("email"));
		lp.getPasswordtextfield().sendKeys(prop.getProperty("password"));
		lp.getLoginbutton().click();
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		Boolean homepage = w.until(ExpectedConditions.urlContains("admin/home.php"));
		System.out.println("IS USER GETTING TO HOMEPAGE :- " + homepage);
		Thread.sleep(2000);
		A37SkillraryLogout lo = new A37SkillraryLogout(d);
		lo.getLogoutbutton().click();
		Thread.sleep(2000);
		lo.getSignoutbtn().click();
		System.out.println("=========   AFTER SIGNING OUT  =========");
		Boolean wlcmpage = w.until(ExpectedConditions.urlContains("index.php"));
		System.out.println("IS USER IS AT WELCOME PAGE :- " + wlcmpage);
		Thread.sleep(5000);
		d.close();
	}
}