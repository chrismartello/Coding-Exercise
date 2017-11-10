package com.cengage.qa.assignment.smoketests;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cengage.qa.assignment.Environment;
import com.cengage.qa.assignment.pages.BasePage;
import com.cengage.qa.assignment.pages.ValuePage;

public class ValuePageTest {
	public ValuePage ValuePage = new ValuePage(new BasePage());
	private static final String PRODUCT_URL = Environment.PRODUCT_URL;
	protected static final String VALUE_PAGE_TITLE = "Value in Education - Cengage";
	protected static final String HEADER_VALUE = "Discover the Possibilities";

	@Before
	public void setUp() throws Exception {
				
    	ValuePage.setDriver(new FirefoxDriver());
        ValuePage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ValuePage.getDriver().get("http://" + PRODUCT_URL);
    	ValuePage.getDriver().findElement(By.linkText("Value")).click();
    	
	}

	@After
	public void tearDown() throws Exception {
		ValuePage.getDriver().closeBrowser();
	}
	@Test
	public void verifyTitleOfValuePage() {
		assertThat(ValuePage.getDriver().getTitle(), is(VALUE_PAGE_TITLE));
	}
	
	@Test
	public void verifyValuePageContent() {
		assertThat(ValuePage.getDriver().getCurrentUrl(), is("http://cengage.com/value/"));
	}
	
	@Test
	public void verifyContentHeading() {
		String xpath = "/html/body/main/div[2]/div[3]/div/div[3]/div/div[3]/div/div[3]/div/div[1]/div/h2";
		WebElement siteHeaderText = ValuePage.getDriver().findElement(By.xpath(xpath));
		assertThat(siteHeaderText.getText(), is(HEADER_VALUE));		
		
			
	}

}
