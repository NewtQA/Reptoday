/**
 * 
 */
package com.mercurytours.com.extentreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.CommonUtils.CommonUtils;

/**
 * @author Sreelakshmi Totkar
 *
 */
public class TestNG extends ForExtentReport  {

	/**
	 * @param args
	 */
    @Test
	public void method() {
		// TODO Auto-generated method stub
		try{
		testinfo=reports.createTest("method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreelakshmi Totkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        
		LoginPage lp=new LoginPage(driver);
		lp.verifyLogin();
		
		
		FlightPage fp=new FlightPage(driver);
		fp.verifyFlightPage();
		
		SelectFlight sf=new SelectFlight(driver);
		sf.verifySelectFlight();
		
		BookFlight bf=new BookFlight(driver);
		bf.verifyBookFlight(); 
		
		FlightConfirmationPage fc=new FlightConfirmationPage(driver);
		fc.verifyFlightConfirmationPage();
		
		CommonUtils cc=new CommonUtils(driver);
		cc.closeBroswer(driver);
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		
	}

