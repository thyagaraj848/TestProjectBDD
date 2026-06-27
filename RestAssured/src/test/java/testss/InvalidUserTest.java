package testss;


	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class InvalidUserTest extends BaseTest {

	    @BeforeMethod
	    public void init() {

	        setup();

	    }

	    @Test
	    public void verifyInvalidUser() {

	        Response response = RestAssured
	                .given()
	                .when()
	                .get("/users/999");

	        System.out.println("Status Code : " + response.getStatusCode());

	        Assert.assertEquals(response.getStatusCode(), 404);

	    }
	}


