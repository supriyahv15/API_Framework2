package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;
import utility.payloadconvertor;

public class TransferRepository {
	
	public static String baseUrl=CreateUrl.getBaseurl("/repos/supriyahv15/API_Framework3/transfer");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public void transferRepo() throws IOException {
		String payload = payloadconvertor.generatepayload("TransferRepo.json");
		response=BaseClass.postRequest(baseUrl, payload, token);
		String response_body=response.getBody().asString();
		Reporter.log(response_body,true);
		Assert.assertEquals(commonresponse.getStatusCode(response), 202);
		
	}
	

}
