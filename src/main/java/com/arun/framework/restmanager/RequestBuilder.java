package com.arun.framework.restmanager;

import com.arun.framework.requestexecutor.RequestType;
import io.restassured.http.ContentType;

public class RequestBuilder {

	String baseURI;
	Object reqObj;
	String basePath;
	ContentType contentType;
	RequestType requestType;

	/**
	 * Enum for Request Content Type.
	 */
	public enum RequestContentType {
		JSON, XML
	}

	/**
	 * Method to Set Content Type of Rest Request.
	 * 
	 * @param requestContentType
	 */
	public void setContentType(RequestContentType requestContentType) {
		if (requestContentType == RequestContentType.JSON) {
			this.contentType = ContentType.JSON;
		}

		else if (requestContentType == RequestContentType.XML) {
			this.contentType = ContentType.XML;
		}
	}

	/**
	 * Getter for Request Content Type.
	 * 
	 * @return - ContentType Object
	 */
	public ContentType getContentType() {
		return contentType;
	}

	/**
	 * Setter for Request Base URI
	 * 
	 * @param baseURI
	 *            - Base URI for Request.
	 */
	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
	}

	/**
	 * Getter for Base URI.
	 * 
	 * @return - Base URI for Request
	 */
	public String getBaseURI() {
		return this.baseURI;
	}

	/**
	 * Setter for Base Path for Request.
	 * 
	 * @param basePath
	 *            - Base Path
	 */
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	/**
	 * Getter for Base Path
	 * 
	 * @return - Base Path
	 */
	public String getBasePath() {
		return this.basePath;
	}

	/**
	 * Setter for RequestType.
	 * 
	 * @param requestType
	 *            - Type of request to execute
	 */
	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	/**
	 * Getter for RequestType.
	 * 
	 * @return - RequestType Enum
	 */
	public RequestType getRequestType() {
		return requestType;
	}
}
