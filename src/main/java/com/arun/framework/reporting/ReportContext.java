package com.arun.framework.reporting;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTestInterruptedException;

/**
 * @author Arun
 *
 */
public class ReportContext {

    private static ExtentReports extent=null;
	private static ExtentTest test=null;
	private static ExtentTestInterruptedException testexception=null;
	private static Test testAnnotation=null;

    /**
	 * Initialize the report context objects in constructor
	 * 
	 * @param extent
	 * @param test
	 * @param testAnnotation
	 * @param testexception
	 */


	public ReportContext(ExtentReports extent, ExtentTest test, Test testAnnotation,
			ExtentTestInterruptedException testexception) {
		if(ReportContext.extent==null) {
          ReportContext.extent=extent;
        }
		if(ReportContext.test==null) {
			ReportContext.test = test;
		}
		if(ReportContext.testAnnotation==null) {
			ReportContext.testAnnotation = testAnnotation;
		}
		if(ReportContext.testexception==null) {
			ReportContext.testexception = testexception;
		}
	}

}
