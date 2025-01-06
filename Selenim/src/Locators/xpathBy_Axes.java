package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_Axes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///home/devops/table.html");
		Thread.sleep(2000);
		String mn = "GOAT";
		String collection = d.findElement(By.xpath("//td[text()='"+mn+"']/following-sibling::td[1]")).getText();
//		String p = d.findElement(By.xpath("//td[text()='ANIMAL']/preceding-sibling::td")).getText();
//		System.out.println("Position of ANIMAL is: " + p);
		System.out.println("Collection of GOAT is : " + collection);
		Thread.sleep(2000);
		d.close();
		
	}

}
