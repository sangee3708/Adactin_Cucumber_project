package com.adactinStepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactinRunner.AdactinRunner;
import com.baseClass_Adactin.BaseClass;
import com.projectObjectManager_Adactin.Adactin_POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import propertyFileConfiguration_Adactin.FileReaderManager;

public class AdactinStepDefinition extends BaseClass {

	public static WebDriver driver = AdactinRunner.driver;
	public static Adactin_POM pom = new Adactin_POM(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String urlData = FileReaderManager.getInstanceFRM().getInstanceCR().getUrlData();
		getUrl(urlData);
		sleep(2);
	}

	@When("^user Enter The Username In Username Textbox$")
	public void user_Enter_The_Username_In_Username_Textbox() throws Throwable {

		String usernameData = FileReaderManager.getInstanceFRM().getInstanceCR().getUsernameData();
		passValue(pom.getInstanceLoginPage().getUsername(), usernameData);
	}

	@When("^user Enter The Password In Password TextBox$")
	public void user_Enter_The_Password_In_Password_TextBox() throws Throwable {

		String passwordData = FileReaderManager.getInstanceFRM().getInstanceCR().getPasswordData();
		passValue(pom.getInstanceLoginPage().getPassword(), passwordData);
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		onClick(pom.getInstanceLoginPage().getLogin_button());
	}

	@Given("^user Enter Details To Search Hotel$")
	public void user_Enter_Details_To_Search_Hotel() throws Throwable {

	}

	@When("^user Selects The Location In Location Field$")
	public void user_Selects_The_Location_In_Location_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getLocation(), "byVisibleText", "London");
	}

	@When("^user Selects The Hotel Name In Hotel Field$")
	public void user_Selects_The_Hotel_Name_In_Hotel_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getHotels(), "byVisibleText", "Hotel Sunshine");
	}

	@When("^user Selects The Room Type In Room Type Field$")
	public void user_Selects_The_Room_Type_In_Room_Type_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getRoom_type(), "byVisibleText", "Super Deluxe");
	}

	@When("^user Selects The Number Of Rooms in Room Type Field$")
	public void user_Selects_The_Number_Of_Rooms_in_Room_Type_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getNumOfRooms(), "byVisibleText", "1 - One");
	}

	@When("^user Enter The Check In Date In Check In Date Text Box$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Text_Box() throws Throwable {

		passValue(pom.getInstanceSearchHotel().getCheckInDate(), "28/08/2022");
	}

	@When("^user Enter The Check Out Date In Check Out Date Text Box$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Text_Box() throws Throwable {

		passValue(pom.getInstanceSearchHotel().getCheckOutDate(), "29/08/2022");
	}

	@When("^user Select The Number Of Adults In A Room In The Adults Per Room Field$")
	public void user_Select_The_Number_Of_Adults_In_A_Room_In_The_Adults_Per_Room_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getAdultPerRoom(), "byVisibleText", "1 - One");
	}

	@When("^User Select The Number Of Children In A Room In The Children Per Room Field$")
	public void user_Select_The_Number_Of_Children_In_A_Room_In_The_Children_Per_Room_Field() throws Throwable {

		dropDown_select(pom.getInstanceSearchHotel().getChildPerRoom(), "byVisibleText", "0 - None");
	}

	@Then("^user Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {

		onClick(pom.getInstanceSearchHotel().getSubmit());
	}

	@Given("^user Selects The Hotel Details To Continue$")
	public void user_Selects_The_Hotel_Details_To_Continue() throws Throwable {

		
	}

	@When("^user Selects The Hotel In Select Button$")
	public void user_Selects_The_Hotel_In_Select_Button() throws Throwable {

		onClick(pom.getInstanceSelectHotel().getRadioButton());
	}

	@Then("^user Click On The Continue Button And It Navigate To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {

		onClick(pom.getInstanceSelectHotel().getContinueButton());
	}

	@Given("^user Enter Their Address And Payment Details$")
	public void user_Enter_Their_Address_And_Payment_Details() throws Throwable {

		
	}

	@When("^user Enter The First Name In First Name Text Box$")
	public void user_Enter_The_First_Name_In_First_Name_Text_Box() throws Throwable {

		sleep(5);
		passValue(pom.getInstanceBookHotel().getFirstName(), "sangi");
	}

	@When("^user Enter The Last Name In Last Name Text Box$")
	public void user_Enter_The_Last_Name_In_Last_Name_Text_Box() throws Throwable {

		passValue(pom.getInstanceBookHotel().getLastName(), "A");
	}

	@When("^user Enter The Address Details In The Billing Address Text Box$")
	public void user_Enter_The_Address_Details_In_The_Billing_Address_Text_Box() throws Throwable {

		passValue(pom.getInstanceBookHotel().getAddress(), "no:55, address");
	}

	@When("^user Enter The Credit Card Number In Credit Card Text Box$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Text_Box() throws Throwable {

		passValue(pom.getInstanceBookHotel().getCCNumber(), "9999955555666662");
	}

	@When("^User Enter Select The Credit Card Type In Credit Card Type Field$")
	public void user_Enter_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {

		dropDown_select(pom.getInstanceBookHotel().getCreditCardType(), "byVisibleText", "Master Card");
	}

	@When("^user Selects The Credit Card Expiry Month In Expiry Date Field$")
	public void user_Selects_The_Credit_Card_Expiry_Month_In_Expiry_Date_Field() throws Throwable {

		dropDown_select(pom.getInstanceBookHotel().getCardExpMonth(), "byVisibleText", "December");
	}

	@When("^user Selects The Credit Card Expiry Year In Expiry Date Field$")
	public void user_Selects_The_Credit_Card_Expiry_Year_In_Expiry_Date_Field() throws Throwable {
 
		dropDown_select(pom.getInstanceBookHotel().getCardExpYear(), "byVisibleText", "2022");
	}

	@When("^user Enter The Credit Card CVV Number In CVV Number Text Box$")
	public void user_Enter_The_Credit_Card_CVV_Number_In_CVV_Number_Text_Box() throws Throwable {

		passValue(pom.getInstanceBookHotel().getCreditCardCVV(), "235");
	}

	@Then("^user Click On The Book Now Button To Book Now$")
	public void user_Click_On_The_Book_Now_Button_To_Book_Now() throws Throwable {

		onClick(pom.getInstanceBookHotel().getBookNowButton());
	}

	@Given("^user Can Check The Booking Confirmation$")
	public void user_Can_Check_The_Booking_Confirmation() throws Throwable {

	}

	@When("^user Click On The Booked Itineray And It Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Booked_Itineray_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {

		onClick(pom.getInstanceBookHotel().getBookedItinerary());
	}

}
