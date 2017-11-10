package com.cengage.qa.assignment.pages;

import org.openqa.selenium.WebDriver;

import com.cengage.qa.assignment.Environment;

public class BasePage {
	private WebDriver driver;
	private HomePage homePage;
	private static final String PRODUCT_URL = Environment.PRODUCT_URL;
	protected static String url;

	public BasePage() {
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return homePage;
	}

	public void setHomePage(HomePage homePage) {
		this.homePage = homePage;
	}
	
	public static String getUrl() {
		return PRODUCT_URL;
	}

	public static void setUrl(String url) {
		BasePage.url = url;
	}
}