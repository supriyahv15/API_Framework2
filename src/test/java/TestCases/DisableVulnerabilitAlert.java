package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapiclass.BaseClass;

import io.restassured.response.Response;
import utility.Authentication;
import utility.CreateUrl;
import utility.commonresponse;

public class DisableVulnerabilitAlert {

	public static String baseUrl=CreateUrl.getBaseurl("/repos/supriyahv15/API_Framework34567/vulnerability-alerts");
	public static String token=Authentication.getBearer_Token();
	public static Response response;
	
	@Test
	public void disableVulnerability() {
		response=BaseClass.deleteRequest(baseUrl, token);
		Assert.assertEquals(commonresponse.getStatusCode(response), 204);
	}
}
