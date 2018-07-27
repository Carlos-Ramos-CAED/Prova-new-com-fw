package com.dbserver.novaloja.AppObjects;

import org.dbserver.framework.widgets.IButton;
import org.dbserver.framework.widgets.IRadioButton;
import org.dbserver.framework.widgets.ITextField;
import org.dbserver.framework.widgets.web.Button;
import org.dbserver.framework.widgets.web.RadioButton;
import org.dbserver.framework.widgets.web.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InscricaoAppObjects {

	private WebDriver driver;

	public InscricaoAppObjects(WebDriver driver) {

		this.driver = driver;

	}

	public ITextField getEmailCreateAccountTextField() {
		return new TextField(driver, By.id("email_create"));

	}

	public IButton getSignInButton() {
		return new Button(driver, By.partialLinkText("Sign in"));
	}

	public IButton getSubmitCreateButton() {
		return new Button(driver, By.id("SubmitCreate"));
	}

	public IRadioButton getGeneroRadioButton() {
		return new RadioButton(driver, By.id("id_gender1"));
	}

	public ITextField getFirstNameTextField() {
		return new TextField(driver, By.id("customer_firstname"));
	}
	
	public ITextField getLastNameTextField() {
		return new TextField(driver, By.id("customer_lastname"));
	}
	
	public ITextField getSenhaTextField() {
		return new TextField(driver, By.id("passwd"));
	}
	
	public WebElement getDaysComboBox() {
		return driver.findElement(By.id("days"));
	}
	
	public WebElement getMonthsComboBox() {
		return driver.findElement(By.id("months"));
	}
	
	public WebElement getYearsComboBox() {
		return driver.findElement(By.id("years"));
	}
	
		
	public ITextField getCompanyTextField() {
		return new TextField(driver, By.id("company"));
	}
	
	public ITextField getAddress1TextField() {
		return new TextField(driver, By.id("address1"));
	}
	
	public ITextField getAddress2TextField() {
		return new TextField(driver, By.id("address2"));
	}
	
	public ITextField getCityTextField() {
		return new TextField(driver, By.id("city"));
	}
	
	public WebElement getStateComboBox() {
		return driver.findElement(By.id("id_state"));
	}
	
	public ITextField getPostcodeTextField() {
		return new TextField(driver, By.id("postcode"));
	}
	
	public WebElement getCountryComboBox() {
		return driver.findElement(By.id("id_country"));
	}
	
	
	public ITextField getAddInfoTextField() {
		return new TextField(driver, By.id("other"));
	}
	
	public ITextField getPhoneTextField() {
		return new TextField(driver, By.id("phone"));
	}
	
	public ITextField getMobilePhoneTextField() {
		return new TextField(driver, By.id("phone_mobile"));
	}
	
	public ITextField getAliasTextField() {
		return new TextField(driver, By.id("alias"));
	}
	
	public IButton getSubmitRegisterButton() {
		return new Button(driver, By.id("submitAccount"));
	}
	
	
	
	/* public WebElement getContinueShoppingButton() {
		WebDriverWait wait = new WebDriverWait(this.driver, 3);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div[1]/a")));
	}

	public WebElement getGoToMyCartButton() {
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sw_dropdown_8")));
	} */
	
	
	
}
