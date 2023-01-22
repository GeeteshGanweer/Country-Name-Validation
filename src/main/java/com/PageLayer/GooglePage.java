package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class GooglePage extends BaseClass {
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement give_search;
	
	@FindBy(xpath="(//input[@name='btnK'])[2]")
	private WebElement click_search;
	
	public GooglePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enter_search(String movieName) {
		UtilsClass.enterValue(give_search, movieName);
	}
	
	public void clickOnsearch() {
		click_search.submit();
	}

}
