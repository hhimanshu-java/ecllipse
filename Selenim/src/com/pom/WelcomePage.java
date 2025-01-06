package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

		@FindBy(linkText = "Register")
		private WebElement registerlink;
		WelcomePage(WebDriver driver){
			PageFactory.initElements(driver, this);
			}
		public WebElement getRegisterlink() {
			return registerlink;
		}
		
	}


