package com.arun.framework.restmanager;

import com.arun.framework.Serializer.JSONSerializer;
import com.arun.framework.requestexecutor.ExecuteRequestInterface;
import io.restassured.response.Response;

public class RestDriver {

	/**
	 * Rest Fields Initialization.
	 */
	RequestBuilder objRequestBuilder;
	ResponseBuilder objResponseBuilder;
	Response apiResponse;
	ExecuteRequestInterface requestObj;

	/**
	 * Constructor to initialize required Classes.
	 */
	public RestDriver() {
		objRequestBuilder = new RequestBuilder();
		objResponseBuilder = new ResponseBuilder();
	}

	/**
	 * Getter for RestRequestSpecifications Object.
	 *
	 * @return
	 */
	public RequestBuilder getobjRequestBuilder() {
		return this.objRequestBuilder;
	}

	/**
	 * Setter for API Response.
	 *
	 * @param response
	 *            - Response Object
	 */
	public void setAPIResponse(Response response) {
		this.apiResponse = response;
	}

	/**
	 * Getter for API Response As String.
	 *
	 * @return - API Response As String
	 * @throws Exception
	 */
	public String getAPIResponseAsString() throws Exception {
		if (this.apiResponse == null) {
			throw new Exception("Can't convert NULL API response To string");
		}
		return this.apiResponse.asString();
	}

	/**
	 * Getter for API Response As POJO.
	 * 
	 * @param type
	 *            - The name of the class
	 * @param <T>
	 *            - The type of the class
	 * @return POJO with values populated from the API response
	 * @throws Exception
	 */
	public <T> T getAPIResponseAsPOJO(Class<T> type) throws Exception {

		if (this.apiResponse == null) {
			throw new Exception("Can't convert NULL API response To pojo");
		}

		JSONSerializer objJsonSerializer = new JSONSerializer();

		return objJsonSerializer.stringToPOJO(this.apiResponse.asString(), type);
	}

	/**
	 * Getter for RestResponseSpecifications Object.
	 *
	 * @return - RestResponseSpecifications Object
	 */
	public ResponseBuilder getobjResponseBuilder() {
		return this.objResponseBuilder;
	}

	/**
	 * Method to get status code (to be used after execution)
	 * 
	 * @return returns int status code from the api response
	 */
	public int getStatusCode() {
		return apiResponse.getStatusCode();
	}

}
