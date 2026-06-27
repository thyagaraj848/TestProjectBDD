package testss;

	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class PostUserTest extends BaseTest {

	    @BeforeMethod
	    public void init() {

	        setup();

	    }

	    @Test
	    public void verifyCreateUser() {

	        String requestBody = "{\n" +
	                "\"title\":\"QA Engineer\",\n" +
	                "\"body\":\"API Automation\",\n" +
	                "\"userId\":1\n" +
	                "}";

	        Response response = RestAssured
	                .given()
	                .contentType(ContentType.JSON)
	                .body(requestBody)
	                .when()
	                .post("/posts");

	        System.out.println("Status Code : " + response.getStatusCode());

	        System.out.println(response.asPrettyString());

	        Assert.assertEquals(response.getStatusCode(), 201);

	        Assert.assertEquals(response.jsonPath().getString("title"), "QA Engineer");

	    }
	}
	
	
	


