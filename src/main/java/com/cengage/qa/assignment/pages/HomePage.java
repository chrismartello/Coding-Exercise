package com.cengage.qa.assignment.pages;

public class HomePage extends BasePage {
	
    protected HomePage homePage;
	
	public HomePage(String PRODUCT_URL) {
		
		BasePage.setUrl(PRODUCT_URL);
		homePage = new HomePage(PRODUCT_URL);	
		homePage.getDriver().close();
	}
}