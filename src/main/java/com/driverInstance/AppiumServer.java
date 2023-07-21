package com.driverInstance;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import java.io.File;

public class AppiumServer{
	
	AppiumDriverLocalService service;
	String osName=System.getProperty("os.name").toLowerCase();
	
	//0-Param Constructor
   public AppiumServer(){

   }
   
   // Start Server Based On Current OS Usage 
   public void startServer(){
	   
	   if(osName.contains("mac")) {
		   
		   service = AppiumDriverLocalService.
		              
		                      buildService(new AppiumServiceBuilder()
		                      .usingDriverExecutable(new File("/usr/local/bin/node"))
		                      .withAppiumJS(new File("/Applications/Appium Server GUI.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
		                      .withIPAddress("127.0.0.1").usingPort(4723)
		                      .withArgument(()->"--base-path", "/wd/hub")
		                      .usingAnyFreePort()
		                      .usingDriverExecutable (new File ("/usr/local/bin/node"))
		                      .withArgument(GeneralServerFlag.LOG_LEVEL, "error"));
     
	   }else {
		  
		   service = AppiumDriverLocalService.
		            
		                      buildService(new AppiumServiceBuilder()
		                      .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		                      .withAppiumJS(new File("C:\\Users\\" + System.getProperty("user.name")
		                              + "\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		                      .withIPAddress("127.0.0.1").usingPort(4723)
		                      .withArgument(()->"--base-path", "/wd/hub")
		                      //.usingAnyFreePort()
		                      .usingDriverExecutable (new File ("C:\\Program Files\\nodejs\\node.exe"))
		                      .withArgument(GeneralServerFlag.LOG_LEVEL, "error"));
	   }
      if (service.isRunning() == true) {
         service.stop();
      } else {
         service.start();
         System.out.println("[EVENT] Appium Server Started Sucessfully.");
      }
   }

   //Stop Server
   public void stopServer(){
      service.stop();
   }
}
