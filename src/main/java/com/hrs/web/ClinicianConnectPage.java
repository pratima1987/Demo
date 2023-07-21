package com.hrs.web;

import org.openqa.selenium.By;

public class ClinicianConnectPage {

	//User Name Text Box
	public static By objUserNameTextBox = By.id("loginEmail");
	//Password Text Box
	public static By objPasswordTextBox = By.id("password");
	//LogIn Button 
	public static By objLoginButton = By.id("loginSubmitButton");
	//Patint List 
	public static By objPatientListButton = By.id("navPatientList");
	//Action Text  
	public static By objActionsText = By.xpath("//span[text()='Actions']");
	//Last Name Column 
	public static By objLastNameColumnNameText = By.xpath("//span[text()='Last Name']");
	//First Name Column 
	public static By objFirstNameColumnNameText = By.xpath("//span[text()='First Name']");
	//Patient ID Column 
	public static By objPatientIDColumnNameText = By.id("//span[text()='Patient ID']");
	//Devices Column 
	public static By objDevicesColumnNameText = By.xpath("//span[text()='Devices']");
	//Days Enrolled Column 
	public static By objDaysEnrolledColumnNameText = By.xpath("//span[text()='Days Enrolled']");
	//Status Column 
	public static By objStatusColumnNameText = By.xpath("//span[text()='Status']");
	//Risk Column 
	public static By objRiskColumnNameText = By.xpath("//span[text()='Risk']");
	//Reviewed Column 
	public static By objReviewedColumnNameText = By.xpath("//span[text()='Reviewed']");
	//Subgroup Column 
	public static By objSubgroupColumnNameText = By.xpath("//span[text()='Subgroup']");
	//Clinician Column 
	public static By objClinicianColumnNameText = By.xpath("//span[text()='Clinician']");
	//Conditions Column 
	public static By objConditionsColumnNameText = By.xpath("//span[text()='Conditions']");
	// Scroll
	
	//Activity Column 
	public static By objActivityColumnNameText = By.xpath("//span[text()='Activity']");
	//Blood Pressure Column 
	public static By objBloodPressureColumnNameText = By.xpath("//span[text()='Blood Pressure']");
	//Glucose Column 
	public static By objGlucoseColumnNameText = By.xpath("//span[text()='Glucose']");
	//Meds Column 
	public static By objMedsColumnNameText = By.xpath("//span[text()='Meds']");
	//Pulse Ox Column 
	public static By objPulseOxColumnNameText = By.xpath("//span[text()='Pulse Ox']");
	//Survey Column 
	public static By objSurveyColumnNameText = By.xpath("//span[text()='Survey']");
	//Temperature Column 
	public static By objTemperatureColumnNameText = By.xpath("//span[text()='Temperature']");
	//Weight Column 
	public static By objWeightColumnNameText = By.xpath("//span[text()='Weight']");
	//Imaging Column 
	public static By objImagingColumnNameText = By.xpath("//span[text()='Imaging']");
	//Stethoscope Column 
	public static By objStethoscopeColumnNameText = By.xpath("//span[text()='Stethoscope']");
	//Steps Column 
	public static By objStepsColumnNameText = By.xpath("//span[text()='Steps']");
	//PC Voice Column 
	public static By objPCVoiceColumnNameText = By.xpath("//span[text()='PC Voice']");
	//Today's Call Column 
	public static By objTodaysCallColumnNameText = By.xpath("(//span[text()='PC Voice']/parent::div/parent::div/parent::div/following-sibling::div[@role='columnheader']/child::div[@role='columnheader']/child::div[@role='button']/child::span[@class='ui-grid-header-cell-label ng-binding'])[1]");
	//Last Call Column 
	public static By objLastCallColumnNameText = By.xpath("//span[text()='Last Call']");
	//Custom Object
	//SSN - Edited Column 
	public static By objSSNEditedColumnNameText = By.xpath("//span[text()='SSN - Edited']");
	//Date Test Column 
	public static By objDateTestColumnNameText = By.xpath("//span[text()='Date Test']");
		
	//Menu Button
	public static By objMenuBarButton = By.xpath("//*[@class='ui-grid-icon-container']");
	//List Of Column
	public static By objColumnList = By.xpath("//*[@class='ui-grid-menu-item']/parent::li/following-sibling::li/child::button");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	
}
