package com.dropdown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/r.php");
		d.findElement(By.name("firstname")).sendKeys("HIMANSHU");
		d.findElement(By.name("lastname")).sendKeys("TIWARI");
		d.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']")).click();
		d.findElement(By.name("reg_email__")).sendKeys("himan.tiwari99@gmail.com");
		d.findElement(By.name("reg_passwd__")).sendKeys("himanSHU@000");
		WebElement day = d.findElement(By.id("day"));
//		Select D = new Select(d.findElement(By.id("day"));
		Select D = new Select(day);
//		D.selectByVisibleText("28");
//		D.selectByIndex(27);
		D.selectByValue("18");
		WebElement month = d.findElement(By.id("month"));
		Select M = new Select(month);
		M.selectByVisibleText("Oct");
		WebElement year = d.findElement(By.id("year"));
		Select Y = new Select(year);
		Y.selectByVisibleText("1999");
		d.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		d.close();
		
	}

}
