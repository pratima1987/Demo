package com.hrs.iOSPage;

import org.openqa.selenium.By;

public class LoginPage {

	// location popup
	public static By objLocationPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Allow “GCashDev” to use your location?\"]");

	// location popup don't allow button
	public static By objDontAllowLocationBtn = By.xpath("//XCUIElementTypeButton[@name=\"Don’t Allow\"]");

	// Track activity popup
	public static By objTrackPopup = By.xpath(
			"//XCUIElementTypeStaticText[@name='Allow “GCashDev” to track your activity across other companies’ apps and websites?']");

	// location popup don't allow button
	public static By objDontAllowTrackBtn = By.xpath("//XCUIElementTypeButton[@name='Ask App Not to Track']");

	// Send notification popup
	public static By objSendNotificationPopup = By
			.xpath("//XCUIElementTypeStaticText[@name='“GCashDev” Would Like to Send You Notifications']");

	// Dont allow button for send notification
	public static By objSendNotificationDontAllowTrackBtn = By.xpath("//XCUIElementTypeButton[@name='Don’t Allow']");

	// Send notification popup
	public static By objRegisterBtn = By.xpath("//XCUIElementTypeButton[@name='REGISTER']");
	
	//Welcome Page login Button
	public static By objLoginBtn = By.xpath("//XCUIElementTypeButton[@name='LOG IN']");

	// Enter your mobile no
	public static By objEnterYourMobileNumber = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter your mobile number\"]");

	// Enter your mobile no field
	public static By objEnterYourMobileNumberFied = By.xpath("//XCUIElementTypeApplication[@name=\"GCashDev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");
	//Keyboard done button
	public static By objKeyboardDoneBtn = By.xpath("//XCUIElementTypeButton[@name=\"Toolbar Done Button\"]");
	
	// Next Button
	public static By objNextBtn = By.xpath("//XCUIElementTypeButton[@name='NEXT']");

	// Authentication Page Header
	public static By objAuthenticationHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"Authentication\"]");

	// OTP field
	public static By objOTPField = By.xpath("(//XCUIElementTypeStaticText[@name=\"–\"])[1]");
	
	// Submit Button
	public static By objSubmitBtn = By.xpath("//XCUIElementTypeButton[@name='SUBMIT']");

	// Invalid Authentication popup
	public static By objInvalidAuthenticationPopup = By
			.xpath("//XCUIElementTypeStaticText[@name='Invalid authentication code.']");

	// OK button
	public static By objOkBtn = By.xpath("//XCUIElementTypeButton[@name='OK']");

	// Authentication page Back button
	public static By objBackBtn = By.xpath("//XCUIElementTypeButton[@name='ic nav back']");

	// MPIN Page
	public static By objMpinPage = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter your MPIN\"]");

	// Mpin 1 pin
	public static By objOneBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");

	// Mpin 2 pin
	public static By objTwoBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

	// Mpin 3 pin
	public static By objThreeBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"3\"]");
	
	//Incorrect MPIN
	public static By objIncorectMPINPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"The MPIN entered is incorrect.\"]");
	
	//Try Again
	public static By objTryAgainIncorrectMPINBTN = By.xpath("//XCUIElementTypeButton[@name=\"Try Again\"]");
	
	//oops! popup
	public static By objOopsPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Oops!\"]");
	
	//Oops Later button
	public static By objOopsLaterBtn = By.xpath("//XCUIElementTypeButton[@name=\"Later\"]");
	
	//Number switch button
	public static By objNumberSwitchBtn = By.xpath("//XCUIElementTypeButton[@name=\"login revamped switch\"]");
	
	//Your are about to switch account
	public static By objYourAreAboutToSwitch = By.xpath("//XCUIElementTypeStaticText[@name=\"Are you sure you want to change your logged in GCash number?\"]");
	
	//Proceed Button
	public static By objProceedBtn = By.xpath("//XCUIElementTypeButton[@name=\"Proceed\"]");
	
	//Invalid OTP popup
	public static By objInvalidCode = By.xpath("//XCUIElementTypeStaticText[@name=\"Invalid authentication code.\"]");
	
	//OTP error popup ok button
	public static By objOTPErrorOKBtn = By.xpath("//XCUIElementTypeButton[@name=\"OK\"]");

	// Mpin entered incorrect
	public static By objIncorrectMPIN = By.xpath("//XCUIElementTypeStaticText[@name='The MPIN entered is incorrect.']");

	// SomethingWent wrong popup
	public static By objSomethingwentWrong = By
			.xpath("//XCUIElementTypeStaticText[@name='Retries have been exceeded.']");

	// ok button
	public static By objOKBtn = By.xpath("//XCUIElementTypeButton[@name=\"OK\"]");

	// Later Button
	public static By objLateBtn = By.xpath("//XCUIElementTypeButton[@name='Later']");
	
	//Incorrect MPIN Popup
	public static By objIncorrectMPINPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Incorrect MPIN\"]");
	
	//Incorrect Mpin try again button
	public static By objTryAgainBtn = By.xpath("//XCUIElementTypeButton[@name=\"Try Again\"]");
	
	//Click center of screen
	public static By objClickCenter = By.xpath("//XCUIElementTypeApplication[@name=\"GCashDev\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther");
	
	//Change number
	public static By objChangeNumber = By.xpath("//XCUIElementTypeStaticText[@name=\"Change Number\"]");
	
	//Yes Button
	public static By objYesButton = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
	
	//Invalid authentication OTP
	public static By objInvalitOTPPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Invalid authentication code.\"]");
	
	//OTP field
	public static By objOTPFieldclear = By.xpath("//XCUIElementTypeApplication[@name=\"GCashDev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTextField");

	//MPIN incorrect popup
	public static By objIncorrectMPINPopups = By.xpath("//XCUIElementTypeStaticText[@name=\"The MPIN entered is incorrect.\"]");
	
	//retries exceeded.
	public static By objRetriesExceeded = By.xpath("//XCUIElementTypeStaticText[@name=\"Retries have been exceeded.\"]");
	
	//Something went wrong
	public static By objSomethingWentWrongs = By.xpath("//XCUIElementTypeStaticText[@name=\"Something went wrong.\"]");
}
