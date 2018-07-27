package com.dbserver.novaloja.tasks;

import org.openqa.selenium.WebDriver;

import com.dbserver.novaloja.AppObjects.LoginAppObjects;

public class LoginTask {
	private WebDriver driver;
	private LoginAppObjects loginAppObjects;

	public LoginTask(WebDriver driver) {

		this.driver = driver;
		this.loginAppObjects = new LoginAppObjects(this.driver);
	}

	public void clicarBtnSignIn(WebDriver driver) {
		this.loginAppObjects.getSignInButton().click();
	}

	public void digitarEmailLogar(WebDriver driver, String email) {
		this.loginAppObjects.getEmailLogarTextField().setText(email);
	}
	
	public void digitarSenhaLogar(WebDriver driver, String senha) {
		this.loginAppObjects.getSenhaLogarTextField().setText(senha);
	}
	
	public void clicarBtnSubmitLogin(WebDriver driver) {
		this.loginAppObjects.getSubmitLoginButton().click();
	}
}
