package com.dbserver.novaloja.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.dbserver.novaloja.AppObjects.InscricaoAppObjects;

public class InscricaoTask {
	private WebDriver driver;
	private InscricaoAppObjects inscricaoAppObjects;

	public InscricaoTask(WebDriver driver) {
		this.driver = driver;
		this.inscricaoAppObjects = new InscricaoAppObjects(this.driver);
	}

	public void clicarSignIn(WebDriver driver) {
		this.inscricaoAppObjects.getSignInButton().click();
	}

	public void digitarEmailCreate(WebDriver driver, String email) {
		this.inscricaoAppObjects.getEmailCreateAccountTextField().setText(email);
	}

	public void clicarSubmitButton(WebDriver driver) {
		this.inscricaoAppObjects.getSubmitCreateButton().click();
	}

	public void clicarGeneroButton(WebDriver driver) {
		this.inscricaoAppObjects.getGeneroRadioButton().click();
	}

	public void preencherFirstName(WebDriver driver, String firstname) {
		this.inscricaoAppObjects.getFirstNameTextField().setText(firstname);
	}

	public void preencherLasttName(WebDriver driver, String lastname) {
		this.inscricaoAppObjects.getLastNameTextField().setText(lastname);
	}
	
	public void preencherSenha(WebDriver driver, String senha) {
		this.inscricaoAppObjects.getSenhaTextField().setText(senha);
	}

	public void selectDiaComboBox(String dia) {
		Select select = new Select(this.inscricaoAppObjects.getDaysComboBox());
		select.selectByValue(dia);
	}
	
	public void selectMesComboBox(String mes) {
		Select select = new Select(this.inscricaoAppObjects.getMonthsComboBox());
		select.selectByValue(mes);
	}
	
	public void selectAnoComboBox(String ano) {
		Select select = new Select(this.inscricaoAppObjects.getYearsComboBox());
		select.selectByValue(ano);
	}
	
	public void preencherCompany(WebDriver driver, String company) {
		this.inscricaoAppObjects.getCompanyTextField().setText(company);
	}
	
	public void preencherAddress1(WebDriver driver, String address1) {
		this.inscricaoAppObjects.getAddress1TextField().setText(address1);
	}
	
	public void preencherAddress2(WebDriver driver, String address2) {
		this.inscricaoAppObjects.getAddress2TextField().setText(address2);
	}
	
	public void preencherCity(WebDriver driver, String city) {
		this.inscricaoAppObjects.getCityTextField().setText(city);
	}
	
	public void selectStateComboBox(String state) {
		Select select = new Select(this.inscricaoAppObjects.getStateComboBox());
		select.selectByValue(state);
	}
	
	public void preencherCep(WebDriver driver, String cep) {
		this.inscricaoAppObjects.getPostcodeTextField().setText(cep);
	}
	
	public void selectCountryComboBox(String country) {
		Select select = new Select(this.inscricaoAppObjects.getCountryComboBox());
		select.selectByValue(country);
	}
	
	public void preencherAddInfo(WebDriver driver, String info) {
		this.inscricaoAppObjects.getAddInfoTextField().setText(info);
	}
	
	public void preencherPhone(WebDriver driver, String phone) {
		this.inscricaoAppObjects.getPhoneTextField().setText(phone);
	}
	
	public void preencherMobilePhone(WebDriver driver, String mphone) {
		this.inscricaoAppObjects.getMobilePhoneTextField().setText(mphone);
	}
	
	public void preencherAliasAddress(WebDriver driver, String alias) {
		this.inscricaoAppObjects.getAliasTextField().setText(alias);
	}
	
	public void clicarSubmitRegister(WebDriver driver) {
		this.inscricaoAppObjects.getSubmitRegisterButton().click();
	}
	
}
