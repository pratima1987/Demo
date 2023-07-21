package com.business.hrs;
import static com.utility.Utilities.*;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

import com.driverInstance.DriverManager;
import com.hrs.Androidpages.LoginPage;
import com.utility.ExtentReporter;



public class HRSBusinessLogic extends BaseClass {
	public static String UN;
	public static String PWD;
	public static String windowID;

	public HRSBusinessLogic() {
		super();

	}

	public static String HRS;
	/*
	 * @param command
	 * @throws Exception
	 * @method location Permission
	 */
	public static void locationPermission() throws Exception {
		if (oSPlatformName.equalsIgnoreCase("Android") || oSPlatformName.equalsIgnoreCase("BrowserStack")) {
			try {
				verifyElementPresent(LoginPage.objLocationPermissionTxt, "Location Permission Popup");
				verifyElementPresentAndClick(LoginPage.objCloseButton, "click on close Button");
			} catch(AssertionError e){
				ExtentReporter.extentLoggerFail("Location Permission", "Location Permission Not Display");
				throw e;
			}
		} else if (oSPlatformName.equalsIgnoreCase("iOS") || oSPlatformName.equalsIgnoreCase("IOSBrowserStack")) {

		}
	}

	/*
	 * @param command
	 * @throws Exception
	 * @method devicelocation Permission
	 */
	public static void devicelocationPermission(String deviceLocation) throws Exception {
		if (oSPlatformName.equalsIgnoreCase("Android") || oSPlatformName.equalsIgnoreCase("BrowserStack")) {
			try {
				if (deviceLocation.equalsIgnoreCase("Allow")) {
					verifyElementPresent(LoginPage.objAllowKRAMER, " Device Location Permission Popup");
					verifyElementPresentAndClick(LoginPage.objWhileUsingApp,"Allow only while using the app button");
				} else {
					verifyElementPresentAndClick(LoginPage.objDontAllow, "Deny Button");
				}
			} catch(AssertionError e){
				ExtentReporter.extentLoggerFail(" Device Location Permission", "Device Location Permission Not Display");
				throw e;
			}
		} else if (oSPlatformName.equalsIgnoreCase("iOS") || oSPlatformName.equalsIgnoreCase("IOSBrowserStack")) {

		}
	}

	/*
	 * @param command
	 * @throws Exception
	 * @method for Login to Application
	 */

	public static void logintoHRSportal(String HRS_URL,String UserName,String Password,String patient_name) throws Exception {		
		switchPlatformToWeb(HRS_URL);	
		windowID = getWebDriver().getWindowHandle();
		explicitWaitVisibility(LoginPage.objUsernameWeb, 20);	
		typeWeb(LoginPage.objUsernameWeb, UserName, "UserName Field");
		explicitWaitVisibility(LoginPage.objPasswordWeb, 20);		
		typeWeb(LoginPage.objPasswordWeb, Password, "Password Field");
		waitForElementAndClickIfPresent(LoginPage.objSignInButtonWeb, 10, "Submit Button");
		waitTime(6000);
		waitForElementAndClickIfPresent(LoginPage.objFirstName, 10, null);		
		clearWebField(LoginPage.objFirstName, "FirstName textfield");		
		waitTime(5000);		
		typeWeb(LoginPage.objFirstName, "", "First Name");		
		typeWeb(LoginPage.objFirstName, patient_name, "First Name");
		waitForElementAndClickIfPresent(LoginPage.objFullpatientList,60,"Full patient List");
		ScrollToTheElement(LoginPage.objGenerateCode);
		waitForElementAndClickIfPresent(LoginPage.objGenerateCode,30, "Generate Code Button");
		UN=findElement(LoginPage.objUsername_Gcode).getText().replace("Username:", "").replaceAll(" ", "");		
		System.out.println(UN);
		PWD=findElement(LoginPage.objPassword_Gcode).getText().replace("Password:", "").replaceAll(" ", "");		
		System.out.println(PWD);		
		waitTime(5000);		
		JSClick(LoginPage.objCloseButtonWeb ,"close Button");
		scrollToTopOfPageWEB();

	}

	/*
	 * @param command
	 * @throws Exception
	 * @method for Login to Application Not Generate Code
	 */

	public static void logintoHRSportalNotGCode(String HRS_URL,String UserName,String Password,String patient_name) throws Exception {		
		//	switchPlatformToWeb(HRS_URL);
		explicitWaitVisibility(LoginPage.objUsernameWeb, 20);	
		typeWeb(LoginPage.objUsernameWeb, UserName, "UserName Field");
		explicitWaitVisibility(LoginPage.objPasswordWeb, 20);		
		typeWeb(LoginPage.objPasswordWeb, Password, "Password Field");
		waitForElementAndClickIfPresent(LoginPage.objSignInButtonWeb, 10, "Submit Button");
		waitTime(6000);
		waitForElementAndClickIfPresent(LoginPage.objFirstName, 10, null);		
		clearWebField(LoginPage.objFirstName, "FirstName textfield");		
		waitTime(5000);		
		typeWeb(LoginPage.objFirstName, "", "First Name");
		waitTime(5000);
		typeWeb(LoginPage.objFirstName, patient_name, "First Name");
	}

	/*
	 * @throws Exception
	 * @method click on signButton button
	 */
	public static void signIntoHRSPCM() throws Exception 
	{
		switchPlatformToAndroid();
		clearBackgroundApps();
		reopenHRS();		
		if(verifyElementAvailable(LoginPage.objConsentForm,"Consent form")) 
		{
			verifyElementPresentAndClick(LoginPage.objNextButton, "Next Button");			
			verifyElementPresent(LoginPage.obj2of3Page,"Consent form 2 page");			
			verifyElementPresentAndClick(LoginPage.objNextButton, "Next Button");			
			verifyElementPresent(LoginPage.objSignature,"Signature page");			
			Swipe("LEFT", 1);		
			verifyElementPresentAndClick(LoginPage.objSubmitButton, "Submit Button");		
		}else {			
			verifyElementPresentAndClick(LoginPage.objSignIn, "Sign In button");
			try {
				System.out.println(platform);
			click(LoginPage.objUsernameField,"UserName Field");
			}catch(Exception e) {
				e.printStackTrace();
			}
			type(LoginPage.objUsernameField, UN, "UserName Field");	
			waitTime(1000);
			click(LoginPage.objPasswordField, "Password Field");
			type(LoginPage.objPasswordField, PWD, "Password Field");	
			waitTime(1000);
			click(LoginPage.objSubmitButton, "Submit Button");
			Thread.sleep(6000);
		}
	}

	/*
	 * @throws Exception
	 * @method use to Login the application
	 */

	public static void verifyLoginPage() throws Exception
	{
		if (verifyElementAvailable(LoginPage.objLocationPermissionTxt, "Location Permission Needed")) {
			locationPermission();
			devicelocationPermission("Allow");
		}
		logintoHRSportal(prop.getproperty("HRS_URL"),prop.getproperty("HRS_USERNAME"),prop.getproperty("HRS_PWD"),prop.getproperty("FirstName"));
		signIntoHRSPCM();		
	}

	/*
	 * @throws Exception
	 * @method for verify the Home page
	 */
	public static void verificationOfHomePageModules() throws Exception 
	{ 	
		verifyElementPresent(LoginPage.objMainmenuButton,"Hamburger menu Button");
		verifyElementPresent(LoginPage.objHRSLogo,"Client Logo");
		verifyElementPresent(LoginPage.objHomeButtonText, "Home Button");
		waitTime(3000);
		if(getText(LoginPage.objActivity).equalsIgnoreCase("Activity")) {
			findElementAndVerifyText(LoginPage.objActivity, "Activity");
		}else {
			findElementAndVerifyText(LoginPage.objActivity, "icon activity Activity");	
		}
		if(getText(LoginPage.objBloodPressure).equalsIgnoreCase("Blood Pressure")) 
		{
			findElementAndVerifyText(LoginPage.objBloodPressure, "Blood Pressure");
		}else {
			findElementAndVerifyText(LoginPage.objBloodPressure, "icon blood-pressure Blood Pressure");
		}
		if(getText(LoginPage.objGlucose).equalsIgnoreCase("Glucose")) 
		{
			findElementAndVerifyText(LoginPage.objGlucose, "Glucose");
		}else {
			findElementAndVerifyText(LoginPage.objGlucose, "icon glucose Glucose");
		}

		if(getText(LoginPage.objMedication).equalsIgnoreCase("Medication")) 
		{
			findElementAndVerifyText(LoginPage.objMedication, "Medication");	
		}else {
			findElementAndVerifyText(LoginPage.objMedication, "icon medication notification Medication");
		}

		if(getText(LoginPage.objOxygenLevel).equalsIgnoreCase("Oxygen Level")) 
		{
			findElementAndVerifyText(LoginPage.objOxygenLevel, "Oxygen Level");	
		}else {
			findElementAndVerifyText(LoginPage.objOxygenLevel, "icon pulse-ox Oxygen Level");
		}
		if(getText(LoginPage.objSurvey).equalsIgnoreCase("Survey")) 
		{
			findElementAndVerifyText(LoginPage.objSurvey, "Survey");	
		}else {
			findElementAndVerifyText(LoginPage.objSurvey, "icon surveys notification Survey");
		}
		scrollToVertical("Imaging");
		
		waitTime(1000);

		if(getText(LoginPage.objTemperature).equalsIgnoreCase("Temperature")) 
		{
			findElementAndVerifyText(LoginPage.objTemperature, "Temperature");	
		}else {
			findElementAndVerifyText(LoginPage.objTemperature, "icon temperature Temperature");
		}

		if(getText(LoginPage.objWeight).equalsIgnoreCase("Weight")) 
		{
			findElementAndVerifyText(LoginPage.objWeight, "Weight");	
		}else {
			findElementAndVerifyText(LoginPage.objWeight, "icon weight Weight");
		}

		findElementAndVerifyText(LoginPage.objImaging, "Imaging");
		verifyElementPresent(LoginPage.objEducationButton, "Education Button");
		verifyElementPresent(LoginPage.objHelpButton, "Help Button");

	}

	/*
	 * @throws Exception
	 * @method for Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission. 
	 */
	public static void recordBloodPressure(String value1,String value2,String value3) throws Exception
	{ 
		reopenHRS();
		verifyElementPresentAndClick(LoginPage.objBloodPressure, "Blood Pressure");
		explicitWaitVisible(LoginPage.objSystolic, 20);
		verifyElementPresentAndClick(LoginPage.objSystolic, "Systolic:(mm Hg)");
		type(LoginPage.objSystolic, value1, "Systolic value Entered");
		explicitWaitVisible(LoginPage.objDiastolic, 20);
		verifyElementPresentAndClick(LoginPage.objDiastolic, "Diastolic:(mm Hg)");
		type(LoginPage.objDiastolic, value2, "Diastolic value Entered");
		explicitWaitVisible(LoginPage.objHeartRate, 20);
		verifyElementPresentAndClick(LoginPage.objHeartRate, "Heart rate:(bpm)");
		type(LoginPage.objHeartRate, value3, "Heart rate value Entered");
		explicitWaitVisible(LoginPage.objSaveButton, 20);
		screencapture();
		verifyElementPresentAndClick(LoginPage.objSaveButton,"Save button");
		String enabled_after = getAttributValue("enabled", LoginPage.objBloodPressure);
		logger.info(getText(LoginPage.objBloodPressure) + " is highlighted:" + enabled_after);
		ExtentReporter.extentLogger("Attribute", getText(LoginPage.objBloodPressure) + " is highlighted:" + enabled_after);
		waitTime(5000);         
		switchPlatformToWeb(prop.getproperty("HRS_URL"));	
		getPlatform();
		//	switchPlatformToWebParentWindow(windowID);
		logintoHRSportalNotGCode(prop.getproperty("HRS_URL"),prop.getproperty("HRS_USERNAME"),prop.getproperty("HRS_PWD"),prop.getproperty("FirstName"));
		waitTime(6000);	
		verifyElementPresent(LoginPage.objPatientTableview, "Patient Table view");
		verifyElementPresent(LoginPage.objPatientBPblock, "Patient BPblock");
		verifyElementPresent(LoginPage.objPatientBPblock,"BPblock");
		String BP1=getText(LoginPage.objPatientBPblock);
		System.out.println(BP1);
		waitForElementAndClickIfPresent(LoginPage.objFullpatientList,60,"Full patient List");
		verifyElementPresent(LoginPage.objOverviewBPblockWeb, "Overview BP block");
		verifyElementPresent(LoginPage.objOverviewBPblockWeb,"BPblock");
		String BP2=getText(LoginPage.objOverviewBPblockWeb);
		System.out.println(BP2);
		waitForElementAndClickIfPresent(LoginPage.objHistoricaldata,60,"Historialdata");
		verifyElementPresent(LoginPage.objHistoricalBPblock,"BPblock");
		String BP3=getText(LoginPage.objHistoricalBPblock);
		System.out.println(BP3);
//		getWebDriver().close();
	}	


	/*
	 * @throws Exception
	 * @method for Validate the UI elements displayed inside the PCM 'Message' modal. 
	 */
	public static void verifySendMessageOption() throws Exception
	{ 
		//Mob
		explicitWaitVisible(LoginPage.objMainmenuButton,20);
		verifyElementPresentAndClick(LoginPage.objMainmenuButton,"Hamburger menu Button");
		explicitWaitVisible(LoginPage.objContactCliniciaText,20);
		verifyElementPresentAndClick(LoginPage.objContactCliniciaText,"Contact Clinician");
		explicitWaitVisible(LoginPage.objMessage,20);
		verifyElementPresentAndClick(LoginPage.objMessage,"Messages");
		findElementAndVerifyText(LoginPage.objMessages,"Messages");
		verifyElementPresent(LoginPage.objClosepcmtButton,"Cancel Button");
		verifyElementPresentAndClick(LoginPage.objMessageTextfield,"Message textfield");
		String generateRandomStringSMS = generateRandomString(10);
		type(LoginPage.objMessageTextfield,generateRandomStringSMS, "meassage typed");
		verifyElementPresentAndClick(LoginPage.objSendButton,"Send Button");
		//	Web
		switchPlatformToWebParentWindow(windowID);
		waitForElementAndClickIfPresent(LoginPage.objCommunication,20,"Communication");		
		waitForElementAndClickIfPresent(LoginPage.objMessageIcon,20,"Meassage Icon");
		findElementAndVerifyTextWeb(LoginPage.smsText(generateRandomStringSMS), generateRandomStringSMS);
		waitForElementAndClickIfPresent(LoginPage.objSMSTextareaFieldWeb,20,"SMS textfield");
		String generateRandomStringWebSMS = generateRandomString(10);
		typeWeb(LoginPage.objSMSTextareaFieldWeb, generateRandomStringWebSMS, "Web SMS textfield");
		waitForElementAndClickIfPresent(LoginPage.objSendButtonWeb,20,"Send Button");
		getWebDriver().close();
		switchPlatformToAndroid();
		waitTime(3000);
		findElementAndVerifyText(LoginPage.SmsVerify(generateRandomStringWebSMS), generateRandomStringWebSMS);
		verifyElementPresentAndClick(LoginPage.objClosepcmtButton,"Close Button");
		waitTime(2000);
		verifyElementPresent(LoginPage.objHomeButtonText, "Home Button");
		explicitWaitVisible(LoginPage.objMainmenuButton,20);
		verifyElementPresentAndClick(LoginPage.objMainmenuButton,"Hamburger menu Button");
		verifyElementPresentAndClick(LoginPage.objSignout,"Signout");
		verifyElementPresentAndClick(LoginPage.objSIGNOUT,"Signout popup");
		
		
}}
