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
public class FlightPage extends ForExtentReport {
	public WebDriver driver;


	By oneway=By.xpath("//input[@value='oneway']");
	By passengers=By.name("passCount");
	By departfrom=By.name("fromPort");
	By month=By.name("fromMonth");
	By day=By.name("fromDay");
	By arrive=By.name("toPort");
	By tomonth=By.name("toMonth");
	By today=By.name("toDay");
	By service=By.xpath("//input[@value='Business']");
	By airline=By.name("airline");
	By findFlights=By.name("findFlights");

	public FlightPage(WebDriver driver){
		this.driver=driver;
	}
	public void verifyFlightPage(){
		CommonUtils cu=new CommonUtils(driver);
            cu.click(oneway);
			cu.dropDown(passengers,"2");
			cu.dropDown(departfrom, "London");
			cu.dropDown(month,"June");
			cu.dropDown(day, "16");
			cu.dropDown(arrive, "Paris");
			cu.dropDown(tomonth, "June");
			cu.dropDown(today, "17");
			cu.click(service);
			cu.dropDown(airline, "Blue Skies Airlines");
			cu.click(findFlights);
	}


	
}
