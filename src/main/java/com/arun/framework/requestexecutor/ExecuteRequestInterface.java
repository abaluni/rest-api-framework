package com.arun.framework.requestexecutor;

import com.arun.framework.restmanager.RestDriver;

/**
 * Base Interface for All Types of Requests that can be executed from the API Framework
 */
public interface ExecuteRequestInterface {

	void executeRequest(RestDriver restDriveObject);
// Different types of executeRequest can be added to implement in future	
}
