package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A37SkillraryLoginPage {
	@FindBy(id = "email")
	private WebElement emailtextfield;
	
	public A37SkillraryLoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	
	@FindBy(id = "password")
	private WebElement passwordtextfield;

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	
	@FindBy(id = "last")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
}

