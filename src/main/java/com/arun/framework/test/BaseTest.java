package com.arun.framework.test;


import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.arun.framework.logger.extentreportlogger.Logger;
import com.arun.framework.reporting.TestReporter;
import com.arun.framework.settings.PropertiesManager;

/**
 * This is the base test class for all test classes
 *
 */
public class BaseTest {

    TestReporter TestReporter = new TestReporter();
    public Logger Logger;
    
    /**
     * Function to set Task Status And Task Timings in logs.
     * To be used in Finally block or just before the Test Case Ends.
     * @param obj Task Manager Object
     */
    
    
      //beforeSuite,beforeTest,beforeClass,beforeMethod. If alwaysRun flag set to true, this configuration method will be run regardless of what groups it belongs to.
    @BeforeGroups
    public void BeforeGroups() {
    }

    @BeforeSuite(alwaysRun = true)
    public void BeforeSuite() throws IOException {
        PropertiesManager.initializeProperties();
    }

    @BeforeTest(alwaysRun = true)
    public void BeforeTest() {
    }

    /**
     * Perform all those tasks which should be run before each method
     *
     * @param method
     */
    @BeforeMethod(alwaysRun = true)
    public void BeforeMethod(Method method) throws IOException {
        // Initialize extent report
        TestReporter.InitializeTestReport(method);

        // Initialize MTLogger object
        Logger = new Logger();
    }
    //AfterSuite,AfterTest,AfterClass,AfterMethod. If alwaysRun flag set to true, this configuration method will be run regardless of what groups it belongs to.
    /**
     * Perform all those tasks which should be run after each method
     *
     * @param result
     */
    @AfterMethod(alwaysRun = true)
    public void AfterMethod(ITestResult result) {
        TestReporter.AfterMethodProcessing(result);
    }

    @AfterTest(alwaysRun = true)
    public void AfterTest() {
    }

    @AfterClass(alwaysRun = true)
    public void AfterClass() {
    }

    @AfterSuite(alwaysRun = true)
    public void AfterSuite() {
    }

    @AfterGroups()
    public void AfterGroups() {
    }
}
