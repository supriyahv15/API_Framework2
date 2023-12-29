package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class GetARepository {
	
	public static String baseURL=CreateUrl.getBaseurl("/repos/supriyahv15/API_Framework34567");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public static void getRepository() {
		
		response=BaseClass.getRequest(baseURL);
		String response_body=response.getBody().asString();
		System.out.println(response_body);
		Assert.assertEquals(commonresponse.getStatusCode(response), 200);
		
	}
	

}
