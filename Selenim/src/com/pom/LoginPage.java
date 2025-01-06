package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		@FindBy(linkText = "Log in")
		private WebElement loginlink;
		
		LoginPage(WebDriver d){
		PageFactory.initElements(d,this);
		}

		public WebElement getLoginlink() {
			return loginlink;
		}
}
