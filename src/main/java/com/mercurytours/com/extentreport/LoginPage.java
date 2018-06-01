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
public class LoginPage extends ForExtentReport {

	/**
	 * @param args
	 */
	public  WebDriver driver;
       
       By username=By.xpath("//input[@name='userName']");
       By password=By.xpath("//input[@name='paword']");
       By signinbutton=By.xpath("//input[@name='login']");
        
   public LoginPage(WebDriver driver){
			this.driver=driver;
		}
   public void verifyLogin(){
	   CommonUtils co=new CommonUtils(driver);
	   co.setEditField(username,"123");
	   co.setEditField(password,"123");
	   co.click(signinbutton);
   }

}
