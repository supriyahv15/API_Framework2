package com.baseapiclass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static Response getRequest(String requesturl) {
		RequestSpecification requestspecification=RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response=requestspecification.get(requesturl);
		return response;
	}
	public static Response getRequest(String requesturl, String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.get(requesturl);
		return response;
	}
	//with body
	public static Response postRequest(String requesturl,String payload, String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given().body(payload);
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.post(requesturl);
		return response;
	}
	
	public static Response postRequest(String requesturl,String bearer_token) {
		RequestSpecification requestSpecification=RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestSpecification.post(requesturl);
		return response;
	}
	
	public static Response putRequest(String requesturl,String payload,String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given().body(payload);
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.put(requesturl);
		return response;
		
	}
	public static Response putRequest(String requesturl,String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.put(requesturl);
		return response;
		
	}
	
	public static Response patchRequest(String requesturl,String payload,String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given().body(payload);
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.patch(requesturl);
		return response;
		
	}
	
	public static Response deleteRequest(String requesturl,String payload,String bearer_token) {
		RequestSpecification requestspecification=RestAssured.given().body(payload);
		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestspecification.put(requesturl);
		return response;
	}
	
	
}
