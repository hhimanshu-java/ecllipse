package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(5000);
		d.findElement(By.partialLinkText("Experience the")).click();
		Thread.sleep(2000);
//		d.findElement(By.xpath("//section[text()='Web Elements']")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//section[text()='Web Elements']")).click();
//		Thread.sleep(2000);
		d.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(3000);
		String IN = "SAMSUNG Galaxy";
		String discount = d.findElement(By.xpath("//th[text()='"+IN+"']/following-sibling::td[3]")).getText();
		System.out.println("Discount on Item is : " + discount);
		System.out.println(d.getTitle());
		Thread.sleep(7000);
		d.close();
	}
}