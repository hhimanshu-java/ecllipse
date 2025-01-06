package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A36WlcmPage {
		@FindBy(linkText = "Register")
		private WebElement registerlink;
		
		public A36WlcmPage(WebDriver d) {
			PageFactory.initElements(d, this);
			
		}

		public WebElement getRegisterlink() {
			return registerlink;
		}
		
}
