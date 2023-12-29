package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class GetListofRepositories {
	
	public static String baseUrl=CreateUrl.getBaseurl("/user/repos");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public static void getListofRepositories() {
		
		response=BaseClass.getRequest(baseUrl, token);
		String response_body=response.getBody().asString();
		System.out.println(response_body);
		Assert.assertEquals(commonresponse.getStatusCode(response), 200);
		
	}

}
