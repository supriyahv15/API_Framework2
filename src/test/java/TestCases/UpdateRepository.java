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

public class UpdateRepository {
	
	public static String baseURL=CreateUrl.getBaseurl("/repos/supriyahv15/API_Framework2");
	public static String bearer_token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public static void updateRepo() throws IOException {
		
		String payload=payloadconvertor.generatepayload("UpdateRepo.json");
		response = BaseClass.patchRequest(baseURL, payload, bearer_token);
	String response_body= response.getBody().asString();
	Assert.assertEquals(commonresponse.getResponseValue(payload, "name"),commonresponse.getResponseValue(response_body, "name"));
	Assert.assertEquals(commonresponse.getStatusCode(response), 200);
		
		
	}

}
