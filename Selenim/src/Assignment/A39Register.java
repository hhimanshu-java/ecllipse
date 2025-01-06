package Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class A39Register {
	public WebElement getRegisterlink() {
		return registerlink;
	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	public A39Register(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(id = "Password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement cnfrmpass;

	public WebElement getCnfrmpass() {
		return cnfrmpass;
	}

	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
}
