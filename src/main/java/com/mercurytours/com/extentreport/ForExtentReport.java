/**
 * 
 */
package com.mercurytours.com.extentreport;

import java.io.File;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author Sreelakshmi Totkar
 *
 */
public class ForExtentReport {
	ExtentReports reports;
	ExtentTest testinfo;
	ExtentHtmlReporter htmlReporter;

	@BeforeSuite
	public void setup(){
		htmlReporter=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/AutomationReports.html"));
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extentreport.xml"));
		reports=new ExtentReports();
		reports.setSystemInfo("Environment", "QA");
		reports.attachReporter(htmlReporter);	
	}
//	@Test
//	public void methodOne(){
//		Assert.assertTrue(true);
//		testinfo.log(Status.INFO,"This is sample test one");
//
//	}
//	@Test
//	public void methodTwo(){
//		Assert.assertTrue(false);
//		testinfo.log(Status.INFO,"This is sample test two");
//
//	}
	/*@BeforeMethod
	public void register(Method method){
		String testName=method.getName();
		
	}*/
	@AfterMethod
	public void captureStatus(ITestResult result){
		if(result.getStatus()==ITestResult.SUCCESS){
			testinfo.log(Status.PASS, "the test method named as "+result.getStatus()+"is passed");
		} else if (result.getStatus()==ITestResult.FAILURE){
			testinfo.log(Status.FAIL, "the test method named as "+result.getStatus()+"is failed");
		}else if (result.getStatus()==ITestResult.SKIP){
			testinfo.log(Status.SKIP, "the test method named as "+result.getStatus()+"is skipped");
		}
	}
	@AfterTest
	public void cleanUp(){
		reports.flush();
	
	}
}
