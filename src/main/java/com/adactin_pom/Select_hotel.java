package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public static WebDriver driver;

	public Select_hotel(WebDriver driver2) {
		Select_hotel.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// @FindBy()
	@FindBy(name = "radiobutton_0")
	private WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	@FindBy(name = "continue")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	
}
