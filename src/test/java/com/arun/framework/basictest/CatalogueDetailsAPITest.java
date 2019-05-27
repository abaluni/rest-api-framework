package com.arun.framework.basictest;

import com.arun.framework.test.BaseTest;
import com.arun.framework.logger.extentreportlogger.LogStatus;
import com.arun.framework.getcataloguedetailsapi.pojo.response.GetCatalogueDetailsAPIResponse;
import com.arun.framework.getcataloguedetailsapi.pojo.response.Promotions;
import com.arun.framework.requestexecutor.GetRequest;
import com.arun.framework.restmanager.RestDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;;

public class CatalogueDetailsAPITest extends BaseTest {

	@BeforeMethod
	public void setUp() {
		Logger.assignAuthor("Arun Baluni");
	}

	@Test
	public void verifyNameAsCarbonCreditTest() throws Exception {
		RestDriver restDriver = new RestDriver();
		GetRequest getRequest = new GetRequest();
		getRequest.executeRequest(restDriver);

		try {
			Logger.log(LogStatus.INFO, "Execute the Get request to REST API");

			GetCatalogueDetailsAPIResponse result = restDriver
					.getAPIResponseAsPOJO(GetCatalogueDetailsAPIResponse.class);
			Logger.log(LogStatus.INFO, "Response of the REST API" + restDriver.getAPIResponseAsString());

			// Verify API returns "Carbon credits" in Name response field
			Assert.assertEquals("Carbon credits", result.getName());

			Logger.log(LogStatus.INFO, "Name field value is: " + result.getName());
		} catch (Exception | AssertionError e) {
			e.printStackTrace();
			Logger.log(LogStatus.FAIL, "Error in catalogueDetailsAPITest. Message = " + e.getMessage());
			Assert.fail(e.getMessage());
		} finally {
			Logger.log(LogStatus.INFO, "API Status :- " + restDriver.getStatusCode());
		}
	}

	@Test
	public void verifyCanRelistTest() throws Exception {
		RestDriver restDriver = new RestDriver();
		GetRequest getRequest = new GetRequest();
		getRequest.executeRequest(restDriver);

		try {
			Logger.log(LogStatus.INFO, "Execute the Get request of    REST API");

			GetCatalogueDetailsAPIResponse result = restDriver
					.getAPIResponseAsPOJO(GetCatalogueDetailsAPIResponse.class);
			Logger.log(LogStatus.INFO, "Response of the REST API" + restDriver.getAPIResponseAsString());

			// Verify API returns "Carbon credits" in Name response field
			Assert.assertEquals("true", result.getCanRelist());

			Logger.log(LogStatus.INFO, "CanRelist field value is: " + result.getCanRelist());
		} catch (Exception | AssertionError e) {
			e.printStackTrace();
			Logger.log(LogStatus.FAIL, "Error in catalogueDetailsAPITest. Message = " + e.getMessage());
			Assert.fail(e.getMessage());
		} finally {
			Logger.log(LogStatus.INFO, "API Status :- " + restDriver.getStatusCode());
		}
	}

	@Test
	public void verifyPromotionDescriptionForNameGalleryTest() throws Exception {
		RestDriver restDriver = new RestDriver();
		GetRequest getRequest = new GetRequest();
		getRequest.executeRequest(restDriver);

		try {
			Logger.log(LogStatus.INFO, "Execute the Get request of    REST API");

			GetCatalogueDetailsAPIResponse result = restDriver
					.getAPIResponseAsPOJO(GetCatalogueDetailsAPIResponse.class);
			Logger.log(LogStatus.INFO, "Response of the REST API" + restDriver.getAPIResponseAsString());

			// Verify Promotions with Name Gallery has "2x larger image" in Description
			// field

			String getDescriptionFieldValue = "";
			
			for (Promotions s : result.getPromotions()) {
				if (s.getName().equalsIgnoreCase("Gallery")) {
					getDescriptionFieldValue = s.getDescription();
					Assert.assertTrue(s.getDescription().contains("2x larger image"));
				}

				Logger.log(LogStatus.INFO, "Promotion's description field value is: " + getDescriptionFieldValue);
			}
		} catch (Exception | AssertionError e) {
			e.printStackTrace();
			Logger.log(LogStatus.FAIL, "Error in catalogueDetailsAPITest. Message = " + e.getMessage());
			Assert.fail(e.getMessage());
		} finally {
			Logger.log(LogStatus.INFO, "API Status :- " + restDriver.getStatusCode());
		}
	}
}
