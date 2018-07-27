package com.dbserver.novaloja.AppObjects;

import org.dbserver.framework.widgets.IButton;
import org.dbserver.framework.widgets.ITextField;
import org.dbserver.framework.widgets.web.Button;
import org.dbserver.framework.widgets.web.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EfetuarCompraAppObjects {
	private WebDriver driver;

	public EfetuarCompraAppObjects(WebDriver driver) {

		this.driver = driver;
	}
	
	public ITextField getProcurarProdutoButton() {
		return new TextField(driver, By.id("search_query_top"));
	}
	
	public IButton getClicarDivProdutoBtn() {
		return new Button(driver, By.className("left-block"));
	}
	
	public IButton getClicarAddToCart() {
		return new Button(driver, By.id("add_to_cart"));
	}
	
	public IButton getClicarCheckoutBtn() {
		return new Button(driver, By.partialLinkText("checkout"));
	}
	
	public IButton getProceedCheckoutButton() {
		return new Button(driver, By.partialLinkText("Proceed"));
	}
	
	public IButton getProceedAdressButton() {
		return new Button(driver, By.name("processAddress"));
	}
	
	public IButton getCheckBoxTermsService() {
		return new Button(driver, By.id("uniform-cgv"));
	}
	
	public IButton getProceedShippingButton() {
		return new Button(driver, By.name("processCarrier"));
	}
	
	public IButton getOptionPayButton() {
		return new Button(driver, By.className("bankwire"));
	}
	
	public IButton getConfirmOrderButton() {
		return new Button(driver, By.cssSelector("button.button-medium"));
	}
	
	
	
}
