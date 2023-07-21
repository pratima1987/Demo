package com.hrs.Androidpages;

import org.openqa.selenium.By;

public class LoginPage {

	//================================LoginPage==========================================//

	//Location Permission Needed
	public static By objLocationPermissionTxt=By.xpath("//*[@class='android.widget.TextView' and @text='Location Permissions Needed']");
	
	//CloseButton
	public static By objCloseButton=By.xpath("//*[@class='android.widget.Button' and @text='CLOSE']");

	//Device Location
	public static By objAllowKRAMER=By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_message']");

	//While Using App
	public static By objWhileUsingApp=By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	//Dont Allow
	public static By objDontAllow=By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']");

	//Sign In 
	public static By objSignIn=By.xpath("//*[@class='android.widget.Button' and @text='SIGN IN']");

	//Username TextField
	//public static By objUserName=By.xpath("//*[@class='android.widget.TextView' and @text='One-Time Sign In Username']");
	public static By objUsernameField=By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[1]");

	//Password TextField
	//public static By objPassword=By.xpath("//*[@class='android.widget.TextView' and @text='One-Time Sign In Password']");
	public static By objPasswordField=By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[2]");

	//Submit
	public static By objSubmitButton=By.xpath("//*[@class='android.widget.Button' and @text='SUBMIT']");


	//=======================================Consent Form==============================//

	//consent form header
	public static By objConsentForm=By.xpath("//*[@text='Consent Form']");

	//Next button
	public static By objNextButton=By.xpath("//*[@class='android.widget.Button' and @text='NEXT next']");
	public static By obj2of3Page=By.xpath("//*[@text='Step 2 of 3']");

	//Signature
	public static By objSignature=By.xpath("//*[@class='android.widget.TextView' and @text='Signature:']");

	//===================================HOME PAGE====================================//

	//Hamburger menu
	public static By objMainmenuButton=By.xpath("//*[@class='android.widget.Button' and @text='main menu']");

	//HRS logo
	public static By objHRSLogo=By.xpath("//*[@class='android.widget.Image' and @text='logo-white']");

	//Activity
	public static By objActivity=By.xpath("//*[contains(@text,'Activity')]");

	//Blood Pressure
	public static By objBloodPressure=By.xpath("//*[contains(@text,'Blood Pressure')]");

	//Glucose 
	public static By objGlucose=By.xpath("//*[contains(@text,'Glucose')]");

	//Medication
	public static By objMedication=By.xpath("//*[contains(@text,'Medication')]");

	//Oxygen Level
	public static By objOxygenLevel=By.xpath("//*[contains(@text,'Oxygen Level')]");

	//Survey
	public static By objSurvey=By.xpath("//*[contains(@text,'Survey')]");

	//Temperature
	public static By objTemperature=By.xpath("//*[contains(@text,'Temperature')]");

	//Weight
	public static By objWeight=By.xpath("//*[contains(@text,'Weight')]");

	//Imaging
	public static By objImaging=By.xpath("//*[contains(@text,'Imaging')]");

	//Home Button
	public static By objHomeButtonText=By.xpath("(//*[@class='android.widget.TextView' and @text='Home'])[2]");

	//Education Button
	public static By objEducationButton=By.xpath("//*[@class='android.widget.TextView' and @text='Education']");

	//Help Button
	public static By objHelpButton=By.xpath("//*[@class='android.widget.TextView' and @text='Help']");

	//contact clinician Button
	public static By objContatClinicianButton=By.xpath("//*[@class='android.widget.Button' and @text='contact clinician-pcmt']");


	//========================contact clinician=====================================//

	//contact clinician
	public static By objContactCliniciaText=By.xpath("//*[@text='clinician contact']");

	//video call
	public static By objVideoCall=By.xpath("//*[contains(@text,'Video Call')]");

	//Close pcmt Button
	public static By objClosepcmtButton=By.xpath("//*[@class='android.widget.Button' and @text='close pcmt']");

	//Clinician
	public static By objClinician=By.xpath("//*[@class='android.widget.TextView' and @text='Clinician']");

	//Video icon
	public static By objVideoIcon=By.xpath("//*[@text='icon video-call']");

	//Cancel Button
	public static By objCancelpcmtButton=By.xpath("//*[@class='android.widget.Button' and @text='CANCEL']");

	
	//Call Button
	public static By objCallButton=By.xpath("//*[@class='android.widget.Button' and @text='CALL']");

	//End Call
	public static By objEndcallButton=By.xpath("//*[@class='android.widget.Button' and @text='END CALL']");

	//voice call 
	public static By objVoiceCall=By.xpath("//*[contains(@text,'Voice Call')]");
	
	//voice call text
	public static By objVoicCalltext=By.xpath("//*[@class='android.view.View' and @text='Voice Call']");

	//Voice call icon
	public static By objVoiceCallIcon=By.xpath("//*[@class='android.widget.Image' and @text='icon call-in-progress']");

	//messages
	public static By objMessage=By.xpath("//*[contains(@text,'Messages')]");
	
	//messages Text 
	public static By objMessages=By.xpath("//*[@class='android.view.View' and @text='Messages']");

	//Message Textfield
	public static By objMessageTextfield=By.xpath("//*[@class='android.widget.EditText']");

	//Send Button
	public static By objSendButton=By.xpath("//*[@class='android.widget.Button' and @text='SEND send']");

	//Home Page Tabs
	//public static By objHomeTabs = By.xpath("//*[@resource-id='background-content']/following-sibling::android.view.View/descendant::android.view.View");
	public  static By objHomeTabs=By.xpath("//*[contains(@text,'icon ')]");


	//========================Blood Pressure====================================//

	//Systolic Textfield
	public static By objSystolic=By.xpath("//*[contains(@text,'Systolic: (mm Hg)')]");

	//Diastolic Textfield
	public static By objDiastolic=By.xpath("//*[contains(@text,'Diastolic: (mm Hg)')]");

	//HeartRate Textfield
	public static By objHeartRate=By.xpath("//*[contains(@text,'Heart rate: (bpm)')]");

	//Save button
	public static By objSaveButton=By.xpath("//*[@class='android.widget.Button' and @text='SAVE']");
	
	//Signout
	public static By objSignout=By.xpath("//*[@class='android.widget.Image' and @text='sign out-pcmt']");
	
	//SIGNOUT popup
	public static By objSIGNOUT=By.xpath("//*[@class='android.widget.Button' and @text='SIGN OUT']");

	//===========================Web-(Login and Generate code xpath)======================//

	//Username Web
	public static By objUsernameWeb=By.xpath("//input[@placeholder='Email or Username']");

	//Password Web
	public static By objPasswordWeb=By.xpath("//input[@type='password']");

	//Sign In Web
	public static By objSignInButtonWeb=By.xpath("//span[.=' Sign in ']");

	//Home page first name remove filter
	public static By objRemovefilter=By.xpath("//div[@class='ui-grid-filter-button ng-scope']/child::i[@aria-label='Remove Filter']");

	//Home page First Name
	//	public static By objFirstName=By.xpath("//span[text()='First Name']/parent::div/following-sibling::div[2]/descendant::input");
	public static By objFirstName=By.xpath("//span[text()='First Name']/parent::div/following-sibling::div[2]/child::div/child::div/child::input[@type='text']");

	//Name coloumn for careplan
	public static By objTestdataName=By.xpath("(//div[@class='ui-grid-row ng-scope'])[30]");
	
	//Last Name
	public static By objLastName=By.xpath("//span[text()='Last Name']/parent::div/following-sibling::div[2]/child::div/child::div/child::input[@type='text']");

	//Full patient List icon
	public static By objFullpatientList=By.xpath("//button[@uib-tooltip='Full Patient Profile']");

	//Generate Code
	public static By objGenerateCode=By.xpath("//button[.='Generate Login Codes']");

	//Username_Gcode
	public static By objUsername_Gcode=By.xpath("//span[contains(text(),'User')]/parent::h1");

	//Password_Gcode
	public static By objPassword_Gcode=By.xpath("//span[contains(text(),'Pass')]/parent::h1");

	//close button
	public static By objCloseButtonWeb=By.xpath("//button[.='Close']");

	//Historical data
	public static By objHistoricaldata=By.xpath("//a[.=' Historical Data ']");

	//Bloodpressure block in table

	public static By objHistoricalBPblock=By.xpath("//table/tbody/tr[@class='qa-spreadsheet_table--row-0 odd']");

	//Overview BPBlock in table

	public static By objOverviewBPblockWeb=By.xpath("//table/tbody/tr/td/span[@class='qa-bloodpressure_last--reading']");

	//Patient List BP block

	public static By objPatientBPblock=By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-000K qa-patient_list_table--cell-bp cell-danger'])[1]");

	//Patient List Module
	public static By objPatientList=By.xpath("//a[contains(text(),' Patient List ')]");
	
	//Pratima Patient full view in table
	public static By objPatientTableview=By.xpath("(//div[@class='ui-grid-row ng-scope'])[3]");
	
	//================Web-(Careplan)=====================================================//

	//CarePlan
	public static By objCarePaln=By.xpath("//a[.=' Care Plan ']");

	//Pluse Ox
	public static By objPluseOx=By.xpath("//span[.=' Pulse Ox ']");

	//SureveyCarePlan
	public static By objSurveyCarePlan=By.xpath("//span[.=' Survey ']");

	//TemperatureCarePlan
	public static By objTemperatureCarePlan=By.xpath("//span[.=' Temperature ']");

	//WeightCarePaln
	public static By objWeightCarePaln=By.xpath("//span[.=' Weight ']");

	//ImagingCarePaln
	public static By objImagingCarePaln=By.xpath("//span[.=' Imaging ']");

	//AddReminder
	public static By objAddreminder=By.xpath("//button[.='Add Reminder']");

	//cancel ButtonWeb
	public static By objCancelButtonWeb=By.xpath("//button[.='Cancel']");

	//Save Button
	public static By objSaveButtonWeb=By.xpath("//span[.='Save']/preceding::button[.='Add Reminder']");
	
	//communication
	public static By objCommunication=By.xpath("//a[.=' Communication ']");

	//Message Icon
	public static By objMessageIcon=By.xpath("//button[@class='qa-communication_tab--btn-chat btn']");
	
	//SMSTextInWeb(verify)
	 public static By smsText(String smsText) {

	        return By.xpath("//p[contains(text(),'" + smsText + "')]");
	    }
		
	//SMS textareafield
	public static By objSMSTextareaFieldWeb=By.xpath("//textarea[@placeholder='Enter your message here']");
	
	//Send Button Web
	public static By objSendButtonWeb=By.xpath("//span[contains(text(),' Send ')]");
	

	//SMS TextinMobile(verify)
	 public static By SmsVerify(String SmsVerify) {
	
	        return By.xpath("//*[@text='" + SmsVerify + "']");
	    }
}