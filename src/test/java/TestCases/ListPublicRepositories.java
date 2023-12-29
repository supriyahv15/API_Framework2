package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class ListPublicRepositories {

	public static String baseURL=CreateUrl.getBaseurl("/repositories");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public void listPublicRepositories() {
		response=BaseClass.getRequest(baseURL, token);
		String response_body=response.getBody().asString();
		System.out.println(response_body);
		Assert.assertEquals(commonresponse.getStatusCode(response), 200);
	}
}
