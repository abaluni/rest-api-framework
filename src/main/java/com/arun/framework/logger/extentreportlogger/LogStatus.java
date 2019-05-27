package com.arun.framework.logger.extentreportlogger;

import java.io.Serializable;

public enum LogStatus implements Serializable {
	PASS, FAIL, FATAL, ERROR, WARNING, INFO, DEBUG, SKIP;
}
