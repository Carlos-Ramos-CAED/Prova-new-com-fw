package com.dbserver.novaloja.testcases;

import java.util.concurrent.TimeUnit;

import org.dbserver.framework.tools.Report;
import org.dbserver.framework.webdrivers.Drivers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dbserver.novaloja.tasks.EfetuarCompraTask;
import com.dbserver.novaloja.tasks.LoginTask;
import com.dbserver.novaloja.verificationpoints.LoginVerificationPoint;

public class EfetuarCompraTestCase {
	private WebDriver driver;

	//private EfetuarCompraVerificationPoint validarCompraRealizada;
	private LoginVerificationPoint validarLogin; 
	private EfetuarCompraTask efetuarCompraTask;
	private LoginTask loginTask;
	public WebDriverWait espera;

	@Before
	public void setUp() throws InterruptedException {
		Report.create("Nova Loja", "Fazer uma Incrição");
		this.driver = Drivers.getFirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		this.driver.get("http://www.automationpractice.com");

		this.loginTask = new LoginTask(driver);
		this.efetuarCompraTask = new EfetuarCompraTask(driver);
		this.validarLogin = new LoginVerificationPoint(driver);

		this.espera = new WebDriverWait(driver, 8);
	}

	@Test
	public void testMain() throws InterruptedException {

		this.loginTask.clicarBtnSignIn(driver);
		this.loginTask.digitarEmailLogar(driver, "consumidor1@bol.com.br");

		this.loginTask.digitarSenhaLogar(driver, "12345");

		this.loginTask.clicarBtnSubmitLogin(driver);
		
		validarLogin.verificaSeLogouComSucesso();

		this.efetuarCompraTask.setProcurarProduto(driver, "blouse");
		this.driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
		// this.efetuarCompraTask.clicarProdutoEscolhido(driver);
		this.efetuarCompraTask.clicarProdutoEscolhido(driver);
		this.efetuarCompraTask.clicarAddToCart(driver);
		this.efetuarCompraTask.clicarCheckoutBtn(driver);
		this.efetuarCompraTask.clicarProceedCheckoutButton(driver);
		
		this.espera.until(ExpectedConditions.elementToBeClickable(By.name("processAddress"))).click();
		this.efetuarCompraTask.clicarProceedAdressButton(driver);
		
		//this.espera.until(ExpectedConditions.elementToBeClickable(By.id("uniform-cgv")));
		this.efetuarCompraTask.clicarTermsServiceCheckBox(driver);
		//this.driver.findElement(By.id("uniform-cgv")).click();
		
		this.efetuarCompraTask.clicarProceedShippingButton(driver);
		
		this.efetuarCompraTask.clicarOptionPayButton(driver);
		
		Thread.sleep(5000);
		System.out.println("Fire");
		this.efetuarCompraTask.clicarConfirmOrderButton(driver);
		System.out.println("Fire Burn");
	}

	@After
	public void tearDown() throws Exception {
		Report.close();
		driver.quit();
	}

}
