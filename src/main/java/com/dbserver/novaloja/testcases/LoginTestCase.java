package com.dbserver.novaloja.testcases;

import java.util.concurrent.TimeUnit;

import org.dbserver.framework.tools.Report;
import org.dbserver.framework.webdrivers.Drivers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dbserver.novaloja.tasks.LoginTask;

public class LoginTestCase {
	private WebDriver driver;

	private LoginTask loginTask;
	// private InscricaoVerificationPoint validarInscricao;
	public WebDriverWait espera;

	@Before
	public void setUp() throws InterruptedException {
		Report.create("Nova Loja", "Fazer uma Incrição");
		this.driver = Drivers.getFirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		this.driver.get("http://www.automationpractice.com");

		this.loginTask = new LoginTask(driver);
		// this.validarLogin = new LoginVerificationPoint(driver);
		this.espera = new WebDriverWait(driver, 8);
	}

	@Test
	public void testMain() throws InterruptedException {
		loginTask.clicarBtnSignIn(driver);

		loginTask.digitarEmailLogar(driver, "consumidor@bol.com.br");

		loginTask.digitarSenhaLogar(driver, "12345");

		loginTask.clicarBtnSubmitLogin(driver);

	}

	@After
	public void tearDown() throws Exception {
		Report.close();
	}

	
	
	
	
}
