package com.arun.framework.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTestInterruptedException;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author Arun
 *
 */
public class TestReporter {

	private static ExtentReports extent;
	private static ExtentTest test;
	public final static  ExtentTestInterruptedException testexception=null;
    @SuppressWarnings("rawtypes")
	private static ThreadLocal parentTest = new ThreadLocal();
	static ExtentManager objExtentManager = new ExtentManager();

	/**
	 * This method is responsible for all initialization related activities of
	 * report
	 *
	 * @param method
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static ReportContext InitializeTestReport(Method method) throws IOException {

		// Create extent report instance
		extent = objExtentManager.getInstance();
		// Get extent test instance
		test = extent.createTest(method.getName(), method.getName());
		parentTest.set(test);
		// Get the method's annotations
		org.testng.annotations.Test testAnnotation = method.getAnnotation(org.testng.annotations.Test.class);
		// Assign test category fetched from method's annotations
		for(int count =0; count < testAnnotation.groups().length; count++)
		{
			((ExtentTest) parentTest.get()).assignCategory(testAnnotation.groups()[count]);

		}
		// report context object
		return new ReportContext(extent, test, testAnnotation, testexception);
	}
	
	/**
	 * This method will write author name in test report
	 * 
	 * @param author
	 * 
	 * @author Arun
	 */
	public static void assignAuthor(String... author)
	{
		((ExtentTest) parentTest.get()).assignAuthor(author);
	}
	
	/**
	 * This method will write Category name in test report
	 * 
	 * @param category
	 * 
	 */
	public static void assignCategory(String... category)
	{
		((ExtentTest) parentTest.get()).assignCategory(category);
	}
	
	
	/**
	 * This method adds the logs in extent report
	 *
	 * @param status
	 *            - extent reports Status object
	 * @param details
	 *            - Message to be printed in log
	 */
	public static void addLogs(Status status,String details)
	{
		((ExtentTest) parentTest.get()).log(status, details);
	}

	/**
	 * This method adds the logs in extent report
	 *
	 * @param status
	 *            - extent reports Status object
	 * @param t
	 *            - Message to be printed in log
	 */

	public static void addLogs(Status status,Throwable t)
	{
		((ExtentTest) parentTest.get()).log(status, t);
	}

	
    /**
	 * This method is responsible for all tasks to be performed after each
	 * method is run
	 *
	 * @param result
	 *
	 */
	public static void AfterMethodProcessing(ITestResult result) {

		// Update the test result status for extent report
		if (result.getStatus() == ITestResult.FAILURE)
			((ExtentTest) parentTest.get()).fail(result.getThrowable());
		else if (result.getStatus() == ITestResult.SKIP)
			((ExtentTest) parentTest.get()).skip(result.getThrowable());
		else
			((ExtentTest) parentTest.get()).pass("Test passed");

		// Write test information to output view
		extent.flush();
	}
}
