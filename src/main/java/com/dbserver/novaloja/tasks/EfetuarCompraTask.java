package com.dbserver.novaloja.tasks;

import org.openqa.selenium.WebDriver;

import com.dbserver.novaloja.AppObjects.EfetuarCompraAppObjects;

public class EfetuarCompraTask {
private WebDriver driver;
private EfetuarCompraAppObjects efetuarCompraAppObjects;

public EfetuarCompraTask(WebDriver driver) {
	this.driver = driver;
	this.efetuarCompraAppObjects = new EfetuarCompraAppObjects(this.driver);
}

public void setProcurarProduto(WebDriver driver, String prod) {
	this.efetuarCompraAppObjects.getProcurarProdutoButton().setText(prod);
}

public void clicarProdutoEscolhido(WebDriver driver) {
	this.efetuarCompraAppObjects.getClicarDivProdutoBtn().click();
}

public void clicarAddToCart(WebDriver driver) {
	this.efetuarCompraAppObjects.getClicarAddToCart().click();
}

public void clicarCheckoutBtn(WebDriver driver) {
	this.efetuarCompraAppObjects.getClicarCheckoutBtn().click();
}

public void clicarProceedCheckoutButton(WebDriver driver) {
	this.efetuarCompraAppObjects.getProceedCheckoutButton().click();
}

public void clicarProceedAdressButton(WebDriver driver) {
	this.efetuarCompraAppObjects.getProceedAdressButton().click();
}

public void clicarTermsServiceCheckBox(WebDriver driver) {
	this.efetuarCompraAppObjects.getCheckBoxTermsService().click();
}

public void clicarProceedShippingButton(WebDriver driver) {
	this.efetuarCompraAppObjects.getProceedShippingButton().click();
}

public void clicarOptionPayButton(WebDriver driver) {
	this.efetuarCompraAppObjects.getOptionPayButton().click();
}

public void clicarConfirmOrderButton(WebDriver driver) {
	this.efetuarCompraAppObjects.getConfirmOrderButton().click();
}

}
