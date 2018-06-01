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
public class SelectFlight extends ForExtentReport {
	public WebDriver driver;
	
	By departflight=By.name("outFlight");
	By returnflight=By.name("inFlight");
    By continuebtn=By.name("reserveFlights");
	
	public SelectFlight(WebDriver driver){
		this.driver=driver;
	}
	
	public void verifySelectFlight(){
		CommonUtils c=new CommonUtils(driver);
		c.click(departflight);
		c.click(returnflight);
		c.click(continuebtn);
	}

}
