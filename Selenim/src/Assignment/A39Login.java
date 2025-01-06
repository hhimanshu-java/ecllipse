package Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class A39Login {
	public A39Login(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	@FindBy(id = "Email")
	private WebElement loginemail;

	public WebElement getLoginemail() {
		return loginemail;
	}
	
	@FindBy(id = "Password")
	private WebElement loginpass;

	public WebElement getLoginpass() {
		return loginpass;
	}
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
