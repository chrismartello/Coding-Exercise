package com.cengage.qa.assignment.smoketests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.hasSize;

import com.cengage.qa.assignment.Environment;
import com.cengage.qa.assignment.pages.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class HomePageTest {
	public BasePage BasePage = new BasePage();

	protected static String HOME_PAGE_TITLE = "Higher Ed eBooks and Digital Learning Solutions - Cengage";
    protected static String PRODUCT_URL = Environment.PRODUCT_URL;
	
    @Before
	public void setUp() {
    	BasePage.setDriver(new FirefoxDriver());
    	BasePage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	BasePage.getDriver().get("http://" + PRODUCT_URL);
	}
    
	@After
	public void tearDown() {
    	BasePage.getDriver().close();
	}
	
	@Test
    public void verifyTitleOfHomePage() {
		assertThat(BasePage.getDriver().getTitle(), is(HOME_PAGE_TITLE));
    }
	
	@Test
	public void verifyPersonaList() {
		Select personaList = new Select(BasePage.getDriver().findElement(By.id("personaForm_select")));
		List<WebElement> listOfPersonas = personaList.getOptions();
		assertThat(listOfPersonas, hasSize(10));
	}
}