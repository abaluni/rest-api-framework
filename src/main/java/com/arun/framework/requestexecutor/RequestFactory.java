package com.arun.framework.requestexecutor;

import com.arun.framework.requestexecutor.ExecuteRequestInterface;
import com.arun.framework.requestexecutor.RequestType;

public class RequestFactory {
    
	/** Method to create object according to RequestType
	 * @param request POST, PUT, GET, PATCH, HEAD, OPTIONS, DELETE.
	 */
	public static ExecuteRequestInterface createRequestObj(RequestType request)
	{
		return request.CreateHttpMethodObject();
	}
}
