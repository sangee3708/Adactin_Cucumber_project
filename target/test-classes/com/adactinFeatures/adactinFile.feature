Feature: Hotel Booking in Adactin Webpage
Scenario: Login Page
Given user Launch The Application
When user Enter The Username In Username Textbox
And user Enter The Password In Password TextBox
Then user Click On The Login Button And It Navigates To The Search Hotel Page
Scenario: Search Hotel Page
Given user Enter Details To Search Hotel
When user Selects The Location In Location Field
And user Selects The Hotel Name In Hotel Field
And user Selects The Room Type In Room Type Field
And user Selects The Number Of Rooms in Room Type Field
And user Enter The Check In Date In Check In Date Text Box
And user Enter The Check Out Date In Check Out Date Text Box
And user Select The Number Of Adults In A Room In The Adults Per Room Field
And User Select The Number Of Children In A Room In The Children Per Room Field
Then user Click On The Search Button And It Navigates To Select Hotel Page
Scenario: Select Hotel Page
Given user Selects The Hotel Details To Continue
When user Selects The Hotel In Select Button
Then user Click On The Continue Button And It Navigate To The Book A Hotel Page
Scenario: Book A Hotel
Given user Enter Their Address And Payment Details
When user Enter The First Name In First Name Text Box
And user Enter The Last Name In Last Name Text Box
And user Enter The Address Details In The Billing Address Text Box
And user Enter The Credit Card Number In Credit Card Text Box
And User Enter Select The Credit Card Type In Credit Card Type Field
And user Selects The Credit Card Expiry Month In Expiry Date Field
And user Selects The Credit Card Expiry Year In Expiry Date Field
And user Enter The Credit Card CVV Number In CVV Number Text Box
Then user Click On The Book Now Button To Book Now
Scenario: Select Hotel Page
Given user Can Check The Booking Confirmation
When user Click On The Booked Itineray And It Navigate To The Select Hotel Page

















