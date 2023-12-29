package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class CreateFork {
	public static String baseURL=CreateUrl.getBaseurl("/repos/vinitham889/ApiFramework/forks");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public static void createFork() {
		response=BaseClass.postRequest(baseURL, token);
		Assert.assertEquals(commonresponse.getStatusCode(response), 202);
		
		
	}

}
