package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A37SkillraryLogout {
	@FindBy(linkText = "SkillRary Admin")
	private WebElement logoutbutton;
	
	public A37SkillraryLogout(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	@FindBy(linkText = "Sign out")
	private WebElement signoutbtn;

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	
	
}
