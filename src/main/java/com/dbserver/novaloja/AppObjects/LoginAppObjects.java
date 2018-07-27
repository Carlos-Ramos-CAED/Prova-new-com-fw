package com.dbserver.novaloja.AppObjects;

import org.dbserver.framework.widgets.IButton;
import org.dbserver.framework.widgets.ITextField;
import org.dbserver.framework.widgets.web.Button;
import org.dbserver.framework.widgets.web.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAppObjects {

	private WebDriver driver;

	public LoginAppObjects(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public IButton getSignInButton() {
		return new Button(driver, By.partialLinkText("Sign in"));
	}
	
	public ITextField getEmailLogarTextField() {
		return new TextField(driver, By.id("email"));
	}
	
	public ITextField getSenhaLogarTextField() {
		return new TextField(driver, By.id("passwd"));
	}
	
	public IButton getSubmitLoginButton() {
		return new Button(driver, By.id("SubmitLogin"));
	}
	
	
	
}
