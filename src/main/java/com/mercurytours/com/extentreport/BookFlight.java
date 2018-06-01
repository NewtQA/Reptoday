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
public class BookFlight extends ForExtentReport {

	public WebDriver driver;
	public BookFlight(WebDriver driver){
		this.driver=driver;
	}
	By firstname1=By.name("passFirst0");
	By lastname1=By.name("passLast0");
	By meal1=By.name("pass.0.meal");
	By firstname2=By.name("passFirst1");
	By lastname2=By.name("passLast1");
	By meal2=By.name("pass.1.meal");
	By creditcard=By.name("creditCard");
	By number=By.name("creditnumber");
	By expmonth=By.name("cc_exp_dt_mn");
	By expyear=By.name("cc_exp_dt_yr");
	By creditname=By.name("cc_frst_name");
	By creditmidname=By.name("cc_mid_name");
	By creditlastname=By.name("cc_last_name");
	By purchase=By.name("buyFlights");
	
	public void verifyBookFlight(){
		CommonUtils utils=new CommonUtils(driver);
		utils.setEditField(firstname1, "sree");
		utils.setEditField(lastname1, "lakshmi");
		utils.dropDown(meal1,"Vegetarian");
		utils.setEditField(firstname2,"cheelu");
		utils.setEditField(lastname2, "lucky");
		utils.dropDown(meal2,"Low Calorie");
		utils.dropDown(creditcard,"Visa");
		utils.setEditField(number, "76876874874");
		utils.dropDown(expmonth,"02");
		utils.dropDown(expyear, "2009");
		utils.setEditField(creditname, "Santha");
		utils.setEditField(creditmidname, "Totkar");
		utils.setEditField(creditlastname, "k");
		utils.click(purchase);
	}
	
	
}
