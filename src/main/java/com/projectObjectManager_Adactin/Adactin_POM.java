package com.projectObjectManager_Adactin;

import org.openqa.selenium.WebDriver;

import com.adactin_pom.Book_A_Hotel;
import com.adactin_pom.Login_page;
import com.adactin_pom.Search_hotel;
import com.adactin_pom.Select_hotel;

public class Adactin_POM {

	public WebDriver driver;

	public Adactin_POM(WebDriver driver2) { // driver--> runner class driver

		this.driver = driver2;

	}

	private Login_page login;// null

	public Login_page getInstanceLoginPage() {
		if (login == null) {
			login = new Login_page(driver);
		}
		return login;
	}

	private Search_hotel searchHotel;

	public Search_hotel getInstanceSearchHotel() {

		if (searchHotel == null) {
			searchHotel = new Search_hotel(driver);
		}
		return searchHotel;
	}

	private Select_hotel selectHotel;

	public Select_hotel getInstanceSelectHotel() {

		if (selectHotel == null) {
			selectHotel = new Select_hotel(driver);
		}
		return selectHotel;
	}

	private Book_A_Hotel bookHotel;

	public Book_A_Hotel getInstanceBookHotel() {

		if (bookHotel == null) {
			bookHotel = new Book_A_Hotel(driver);

		}
		return bookHotel;
	}

}
