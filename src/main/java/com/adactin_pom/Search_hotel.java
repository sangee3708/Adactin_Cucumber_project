package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;

	public Search_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement room_type;

	public WebElement getRoom_type() {
		return room_type;
	}

	@FindBy(id = "room_nos")
	private WebElement numOfRooms;

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	@FindBy(name = "datepick_out")
	private WebElement checkOutDate;

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	@FindBy(id = "adult_room")
	private WebElement adultPerRoom;

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	@FindBy(id = "child_room")
	private WebElement childPerRoom;

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

}
