package com.arun.framework.logger.extentreportlogger;

import com.arun.framework.reporting.TestReporter;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

/**
 * Logger class that uses Extent Report's logger functionality
 */
public class Logger {

	public static boolean useExtent = true;

	/**
	 * Initialize ExtentTest object
	 *
	 */
	public Logger() {

	}

	/**
	 * This method logs the information in extent report
	 *
	 * @param status
	 *            - type of log status (Debug, Info etc.)
	 * @param details
	 *            - Message to be printed in log
	 *
	 *            <pre>
	 * <h1>Example-</h1>
	 * {@code
	 * obj.log(LogStatus.Info, "This is sample log");
	 * }
	 *            </pre>
	 *
	 */
	public void log(LogStatus status, String details) {
		if (useExtent) {
			TestReporter.addLogs(GetStatus(status), details);
		}
	}

	/**
	 * This method logs the information with exception in extent report
	 *
	 * @param status
	 *            - type of log status (Debug, Info etc.)
	 * @param t
	 *            - exception to be printed in log
	 */
	public void log(LogStatus status, Throwable t) {
		t.printStackTrace();
		if (useExtent) {
			TestReporter.addLogs(GetStatus(status), t);
		}
	}

	/**
	 * This method logs the information with markup in extent report
	 *
	 * @param status
	 *            - type of log status (Debug, Info etc.)
	 * @param message
	 *            - Message to be printed in log
	 * @param markupColor
	 *            - markup color to be used to create markup
	 *
	 *            <pre>
	 * <h1>Example-</h1>
	 * {@code
	 * obj.log(LogStatus.Info, "This is sample markup log", MarkupColor.AMBER);
	 * }
	 *            </pre>
	 */
	public void log(LogStatus status, String message, MarkupColor markupColor) {
		if (useExtent) {
			String details = GetMarkup(message, markupColor).getMarkup();
			TestReporter.addLogs(GetStatus(status), details);
		}
	}

	/**
	 * This method will write author name in test report
	 *
	 * @param author
	 *
	 * @author Arun
	 */
	public void assignAuthor(String... author) {
		if (useExtent) {
			TestReporter.assignAuthor(author);
		}

	}

	/**
	 * This method will write category name in test report
	 *
	 * @param category
	 *
	 * @author Arun
	 */
	public void assignCategory(String... category) {
		if (useExtent) {
			TestReporter.assignCategory(category);
		}

	}

	/**
	 * Get status value for log
	 *
	 * @param status
	 *            - type of log status
	 * @return - This returns the extentreports Status object
	 *
	 * @author Arun
	 */
	private Status GetStatus(LogStatus status) {
		Status retval = null;
		switch (status) {
		case INFO:
			retval = Status.INFO;
			break;
		case DEBUG:
			retval = Status.DEBUG;
			break;
		case ERROR:
			retval = Status.ERROR;
			break;
		case FAIL:
			retval = Status.FAIL;
			break;
		case FATAL:
			retval = Status.FATAL;
			break;
		case PASS:
			retval = Status.PASS;
			break;
		case SKIP:
			retval = Status.SKIP;
			break;
		case WARNING:
			retval = Status.WARNING;
			break;
		}
		return retval;
	}

	/**
	 * Get extent report markup object
	 *
	 * @param message
	 * @param markupColor
	 * @return
	 *
	 * @author Arun
	 */
	private Markup GetMarkup(String message, MarkupColor markupColor) {
		return MarkupHelper.createLabel(message, GetMarkupColor(markupColor));
	}

	/**
	 * Get markup color for log
	 *
	 * @param markupColor
	 *            - color to be used in markup
	 * @return - This returns the ExtentColor object
	 *
	 * @author Arun
	 */
	private ExtentColor GetMarkupColor(MarkupColor markupColor) {
		ExtentColor retval = null;
		switch (markupColor) {
		case AMBER:
			retval = ExtentColor.AMBER;
			break;
		case BLACK:
			retval = ExtentColor.BLACK;
			break;
		case BLUE:
			retval = ExtentColor.BLUE;
			break;
		case BROWN:
			retval = ExtentColor.BROWN;
			break;
		case CYAN:
			retval = ExtentColor.CYAN;
			break;
		case GREY:
			retval = ExtentColor.GREY;
			break;
		case INDIGO:
			retval = ExtentColor.INDIGO;
			break;
		case LIME:
			retval = ExtentColor.LIME;
			break;
		case ORANGE:
			retval = ExtentColor.ORANGE;
			break;
		case PINK:
			retval = ExtentColor.PINK;
			break;
		case PURPLE:
			retval = ExtentColor.PURPLE;
			break;
		case RED:
			retval = ExtentColor.RED;
			break;
		case TEAL:
			retval = ExtentColor.TEAL;
			break;
		case TRANSPARENT:
			retval = ExtentColor.TRANSPARENT;
			break;
		case WHITE:
			retval = ExtentColor.WHITE;
			break;
		case YELLOW:
			retval = ExtentColor.YELLOW;
			break;
		case GREEN:
			retval = ExtentColor.GREEN;
			break;
		}
		return retval;
	}

}
