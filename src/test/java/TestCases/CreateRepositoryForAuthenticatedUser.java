package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;
import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;
import utility.payloadconvertor;

public class CreateRepositoryForAuthenticatedUser {
	
	public static String baseURL=CreateUrl.getBaseurl("/user/repos");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public static void createRepo() throws IOException {
		
		String payload = payloadconvertor.generatepayload("CreateRepo.json");
		response=BaseClass.postRequest(baseURL, payload, token);
		String response_body=response.getBody().asString();
		System.out.println(response_body);
		Assert.assertEquals(commonresponse.getResponseValue(payload, "name"), commonresponse.getResponseValue(response_body,"name"));
		Assert.assertEquals(commonresponse.getStatusCode(response), 201);	
		
	}
	

	

}
