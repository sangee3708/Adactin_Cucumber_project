package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public WebDriver driver;

	public Book_A_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(name = "last_name")
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(name = "address")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}

	@FindBy(name = "cc_num")
	private WebElement CCNumber;

	public WebElement getCCNumber() {
		return CCNumber;
	}

	@FindBy(name = "cc_type")
	private WebElement CreditCardType;

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	@FindBy(name = "cc_exp_month")
	private WebElement CardExpMonth;

	public WebElement getCardExpMonth() {
		return CardExpMonth;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement CardExpYear;

	public WebElement getCardExpYear() {
		return CardExpYear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement CreditCardCVV;

	public WebElement getCreditCardCVV() {
		return CreditCardCVV;
	}

	@FindBy(name = "book_now")
	private WebElement BookNowButton;

	public WebElement getBookNowButton() {
		return BookNowButton;
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}
}
