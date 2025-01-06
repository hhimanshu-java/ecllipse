package Assignment;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		d.findElement(By.partialLinkText("Facebook")).click();
		
		switchToWindow(d, "facebook");
		d.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		switchToWindow(d, "reg");
		Thread.sleep(3000);
		d.findElement(By.name("firstname")).sendKeys("Himanshu");

		
//		Thread.sleep(3000);
//		String pid = d.getWindowHandle();
//		Set<String> ids = d.getWindowHandles();
//		for (String s : ids)
//		{
//			d.switchTo().window(s);
//			Thread.sleep(7000);
//			String url = d.getCurrentUrl();
//			System.out.println(url);
//		}
//		d.findElement(By.xpath("//span[text()='Create new account']")).click();
//		Thread.sleep(3000);
//		Set<String> WH = d.getWindowHandles();
//		for (String id : WH) 
//		{
//			d.switchTo().window(id);
//			System.out.println(d.getTitle());
//		}
//		d.findElement(By.name("firstname")).sendKeys("Himanshu");
	}
	public static void switchToWindow(WebDriver d, String expurl) {
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
