package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class GoogleSearchPage extends BaseClass {

	@FindBy(xpath = "(//h3[text()='Pushpa: The Rise - Wikipedia'])[1]")
	private WebElement click_wiki;
	
	@FindBy(xpath = "//h3[text()='Pushpa: The Rise - Part 1 (2021) - IMDb']")
	private WebElement click_imdb;

	public GoogleSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnwiki() {
		UtilsClass.click(click_wiki);
	}

	public String captureGoogleTitle() {
		return driver.getTitle();
	}

	public void clickOnimdb() {
		
		UtilsClass.click(click_imdb);
	}

}
