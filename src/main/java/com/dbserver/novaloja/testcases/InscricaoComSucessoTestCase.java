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

import com.dbserver.novaloja.tasks.InscricaoTask;

public class InscricaoComSucessoTestCase {
	private WebDriver driver;

	private InscricaoTask cadastrando;
	// private InscricaoVerificationPoint validarInscricao;
   
	
    public WebDriverWait espera;

	@Before
	public void setUp() throws InterruptedException {
		Report.create("Nova Loja", "Fazer uma Incrição");
		this.driver = Drivers.getFirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		this.driver.get("http://www.automationpractice.com");

		this.cadastrando = new InscricaoTask(driver);
		// this.validarInscricao = new InscricaoVerificationPoint(driver);
       
		this.espera = new WebDriverWait(driver, 8);

	}

	@Test
	public void testMain() throws InterruptedException {

		this.cadastrando.clicarSignIn(driver);

		this.espera.until(ExpectedConditions.elementToBeClickable(By.id("email_create"))).click();
		this.cadastrando.digitarEmailCreate(driver, "consumidor7@bol.com.br");

		this.cadastrando.clicarSubmitButton(driver);

		this.espera.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		this.cadastrando.clicarGeneroButton(driver);
		this.cadastrando.preencherFirstName(driver, "Carlos Eduardo");
		this.cadastrando.preencherLasttName(driver, "Ramos");
		this.cadastrando.preencherSenha(driver, "12345");
		this.driver.findElement(By.id("passwd")).sendKeys(Keys.TAB);
		this.cadastrando.selectDiaComboBox("18");
		this.cadastrando.selectMesComboBox("11");
		this.cadastrando.selectAnoComboBox("1984");
		this.cadastrando.preencherCompany(driver, "DBServer");
		this.cadastrando.preencherAddress1(driver, "Av. Ipiranga, 666");
		this.cadastrando.preencherAddress2(driver, "Av. Bento Golçalves, 69");
		this.cadastrando.preencherCity(driver, "Porto Alegre");
		this.cadastrando.selectStateComboBox("15");
		this.cadastrando.preencherCep(driver, "51052");
		this.cadastrando.selectCountryComboBox("21");
		this.cadastrando.preencherAddInfo(driver,"Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica ");
		this.cadastrando.preencherPhone(driver, "3375-4598");
		this.cadastrando.preencherMobilePhone(driver, "99265-9845");
		this.cadastrando.preencherAliasAddress(driver, "Rua vasco da gama, 121");
		this.cadastrando.clicarSubmitRegister(driver);
						
	}

	@After
	public void tearDown() throws Exception {
		Report.close();
	}

}
