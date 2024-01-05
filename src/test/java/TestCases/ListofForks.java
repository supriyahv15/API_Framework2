package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class ListofForks {
	public static String baseURL=CreateUrl.getBaseurl("/repos/supriyahv15/API_Framework34567/forks");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public void listOfForks() {
		response=BaseClass.getRequest(baseURL);
		String response_body=response.getBody().asString();
		Reporter.log(response_body,true);
		Assert.assertEquals(commonresponse.getStatusCode(response), 200);
	}

}
