/**
 * 
 */
package com.mercurytours.com.extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CommonUtils.CommonUtils;

/**
 * @author Sreelakshmi Totkar
 *
 */
public class FlightConfirmationPage extends ForExtentReport {
	WebDriver driver;
	
  public FlightConfirmationPage(WebDriver driver){
	  this.driver=driver;
  }
  
  By logout=By.xpath("//img[@src='/images/forms/Logout.gif']");
  
  public void verifyFlightConfirmationPage(){
	  CommonUtils util=new CommonUtils(driver);
	  util.click(logout);
  }
}
