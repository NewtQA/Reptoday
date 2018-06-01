/**
 * 
 */
package com.CommonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Sreelakshmi Totkar
 *
 */
public class CommonUtils {
	public WebDriver driver;
	  
	  
	public CommonUtils(WebDriver driver){
		this.driver=driver; 
	}
	public void setEditField(By path, String value){
		driver.findElement(path).sendKeys(value);
	}
	public void click(By path){
		driver.findElement(path).click();
	}
	
	public void dropDown(By path,String Value){
		Select sel=new Select(driver.findElement(path));
		sel.selectByVisibleText(Value);
	}
	
	public void closeBroswer(WebDriver driver){
		driver.quit();
	}

}
