package com.arun.framework.requestexecutor;

import static io.restassured.RestAssured.given;
import com.arun.framework.helper.resources;
import com.arun.framework.restmanager.RestDriver;
import com.arun.framework.settings.PropertiesManager;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest implements ExecuteRequestInterface {
	/**
	 * Perform a Get Request
	 * 
	 * @param restDriverObj
	 *            - RestDriver Object to get request specification and set
	 *            APIResponse
	 */
	@Override
	public void executeRequest(RestDriver restDriverObj) {
		
		RestAssured.baseURI = PropertiesManager.getProperty("baseURI"); 
				
		Response response = given().param("catalogue", false).
							when().get(resources.placeGetData()).
							then().assertThat()
							.statusCode(200).and().contentType(ContentType.JSON).and().
							extract().response();
		
		restDriverObj.setAPIResponse(response);
	}

}
