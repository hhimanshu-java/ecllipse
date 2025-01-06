package Assignment;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class A39TestScript {
	@Test(enabled = false)
	public void register() throws EncryptedDocumentException, IOException {
		FileInputStream efis = new FileInputStream("./Test Data/A39DWS.xlsx");
		Workbook workbook = WorkbookFactory.create(efis);
		FileInputStream fis = new FileInputStream("./Test Data/A39CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(prop.getProperty("registerurl"));
		A39Register rg = new A39Register(d);
		rg.getRegisterlink().click();
		rg.getGender().click();
		rg.getFirstname().sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		rg.getLastname().sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		rg.getEmail().sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		rg.getPass().sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		rg.getCnfrmpass().sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue());
		rg.getRegisterbutton().click();
	}
	@Test()
	public void login() throws IOException {
	FileInputStream fis = new FileInputStream("./Test Data/A39CommonData.properties");
	Properties prop = new Properties();
	prop.load(fis);
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get(prop.getProperty("loginurl"));
	A39Login lp = new A39Login(d);
	lp.getLoginemail().sendKeys(prop.getProperty("loginmail"));
	lp.getLoginpass().sendKeys(prop.getProperty("loginpass"));
	lp.getLoginbutton().click();
	}
	@Test()
	public void addtocart() {
		
	}
}