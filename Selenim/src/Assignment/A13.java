package Assignment;
import java.util.Set;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class A13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://www.instagram.com");
//		setting positon of flipkart.
		stw(d, "flipkart");
		Thread.sleep(5000);
		d.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(7000);
		String Ftitle = d.getTitle();
		System.out.println(Ftitle);
		d.close();
//		setting postion of instagram.
		stw(d, "instagram");
		Thread.sleep(5000);
		d.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(7000);
		String Ititle = d.getTitle();
		System.out.println(Ititle);
		d.close();
	}
	public static void stw(WebDriver d, String expurl) {
		Set<String> ID = d.getWindowHandles();
		for (String st : ID) {
			d.switchTo().window(st);
			String acturl = d.getCurrentUrl();
			if (acturl.contains(expurl)) {
				break;
			}			
			}
		}
}