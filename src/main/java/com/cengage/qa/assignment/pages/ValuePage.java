package com.cengage.qa.assignment.pages;

import org.openqa.selenium.WebDriver;

public class ValuePage {
	private BasePage BasePage;
	private WebDriver driver;

	public ValuePage(BasePage basePage) {
		BasePage = basePage;
	}

	public BasePage getBasePage() {
		return BasePage;
	}

	public void setBasePage(BasePage basePage) {
		BasePage = basePage;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}