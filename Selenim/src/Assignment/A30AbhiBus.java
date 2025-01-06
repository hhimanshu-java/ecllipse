package Assignment;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A30AbhiBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.abhibus.com/");
		d.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
		d.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		d.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input")).click();
		List<WebElement> price = d.findElements(By.xpath("//small[text()='Starts at']/..//span"));
        Set<Integer> uniquePricesset = new TreeSet<>();
        System.out.print("ALL PRICES ARE :- ");
		for (WebElement w : price) {
			System.out.print(w.getText() +", ");
            String priceText = w.getText().replace(",", "");		
            int pricevalue = Integer.parseInt(priceText);
            uniquePricesset.add(pricevalue);
		}
        System.out.println();
        System.out.println("AFTER SORTING :- " + uniquePricesset);
        System.out.println("LOWEST PRICE :- " + ((TreeSet<Integer>) uniquePricesset).first());
		Thread.sleep(5000);
		d.close();
	}

}
