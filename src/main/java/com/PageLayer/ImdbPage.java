package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class ImdbPage extends BaseClass {

	@FindBy(xpath = "//a[text()='India']")
	private WebElement captureImdb2;

	public ImdbPage() {
		PageFactory.initElements(driver, this);
	}

	public String capture_imdb_country() {
		return captureImdb2.getText();
	}
}
