package com.dbserver.novaloja.verificationpoints;

import org.dbserver.framework.tools.Report;
import org.dbserver.framework.tools.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

public class LoginVerificationPoint {
	private WebDriver driver;

	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void verificaSeLogouComSucesso() throws InterruptedException {
		ScreenShot.capture(driver);
		
		if (driver.findElement(By.cssSelector(".info-account")).getText().equals("Welcome to your account. Here you can manage all of your personal information and orders.")) {
			Report.log(Status.PASS, "Login realizado com sucesso!");
			System.out.println(Status.PASS);
		} else {
			Report.log(Status.FAIL, "Falha ao tentar logar!");
			System.out.println(Status.FAIL);
		}
		
		
		
		
		
	/*	if (driver.findElement(By.cssSelector("#center_column > div:nth-child(2) > ol:nth-child(2) > li:nth-child(1)")).isDisplayed()) {
			Report.log(Status.FAIL, "Falha ao tentar logar!");
			System.out.println(Status.FAIL);
			
		} else {
			Report.log(Status.PASS, "Login realizado com sucesso!");
			System.out.println(Status.PASS);
		}*/
		
		
	}

}
