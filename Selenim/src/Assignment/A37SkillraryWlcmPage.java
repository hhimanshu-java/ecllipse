package Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class A37SkillraryWlcmPage {

	@FindBy(linkText = "LOGIN")
	private WebElement loginlink;
	
	public A37SkillraryWlcmPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getLoginlink() {
		return loginlink;
	}
}