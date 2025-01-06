package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet 
{

	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			WebDriver d = new ChromeDriver();
			d.get("https://www.facebook.com/");
			System.out.println(d.getTitle());
			String title = driver.getTitle();
			System.out.println(driver.getTitle());
			if (title.equals("youtube")) {
				System.out.println("JAI HO ");
			}
			else {
				System.out.println("SIMON GO BACK");
			}
	}
	

}
