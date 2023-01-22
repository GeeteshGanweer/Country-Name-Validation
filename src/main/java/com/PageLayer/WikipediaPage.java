package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class WikipediaPage extends BaseClass {

	@FindBy(xpath = "//td[text()='India']")
	private WebElement captureWiki2;

	public WikipediaPage() {
		PageFactory.initElements(driver, this);
	}

	public String capture_wiki_country() {

		return captureWiki2.getText();
	}

}
