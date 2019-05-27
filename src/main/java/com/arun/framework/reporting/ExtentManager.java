package com.arun.framework.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Arun
 *
 */
public class ExtentManager {

	private static ExtentReports extent;
	static String reportName = "Test Report";
	static String testReportDirName = "test-output";

	/**
	 * This method returns the instance of extent report
	 *
	 * @return
	 *
	 * @author Arun
	 */
	public static ExtentReports getInstance() throws IOException {
		if (extent == null)
			createInstance(Paths.get(testReportDirName, "testreport.html").toString());

		return extent;
	}

	/**
	 * This method creates the instance of extent report
	 *
	 * @param fileName
	 * @return
	 *
	 */
	private static ExtentReports createInstance(String fileName) throws IOException {
		// Create test report folder if not exist
		createTestReportDir();
		// Create html reporter object for extent report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		// Set the chart location for report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		// Set whether chart should be visible or not when report is opened
		htmlReporter.config().setChartVisibilityOnOpen(true);
		// Set the theme of report
		htmlReporter.config().setTheme(Theme.STANDARD);
		// Set the document title
		htmlReporter.config().setDocumentTitle(reportName);
		// Set report encoding
		htmlReporter.config().setEncoding("utf-8");
		// Set report name
		htmlReporter.config().setReportName(reportName);

		extent = new ExtentReports();
		// Attach html reporter instance to extent object
		extent.attachReporter(htmlReporter);

		return extent;
	}

	/**
	 * This method creates the 'test-output' folder if not present
	 *
	 * @throws IOException
	 */
	private static void createTestReportDir() throws IOException {
		Path dirPath = Paths.get(".", testReportDirName);
		if (!Files.exists(dirPath))
			Files.createDirectories(dirPath);
	}
}