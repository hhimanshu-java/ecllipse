package Demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCreateMultipleTab {

	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.facebook.com/");
		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://www.whatsapp.com/");
		Set<String> All = d.getWindowHandles();
		System.out.println(All);
		for (String s : All) {
			d.switchTo().window(s);
			String url = d.getCurrentUrl();
			System.out.println(url);
			if(url.contains("whatsapp")){
				d.close();
			}		
		}
	}

}
