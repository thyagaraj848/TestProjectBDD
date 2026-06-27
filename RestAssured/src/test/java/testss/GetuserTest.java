package testss;


	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class GetuserTest extends BaseTest {

	    @BeforeMethod
	    public void init() {

	        setup();

	    }

	    @Test
	    public void verifyGetUsers() {

	    	Response response = RestAssured
	    	        .given()
	    	        .when()
	    	        .get("/users/1");
	        System.out.println("Status Code : " + response.getStatusCode());

	        System.out.println(response.asPrettyString());

	        Assert.assertEquals(response.getStatusCode(), 200);
	        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
	        Assert.assertEquals(response.jsonPath().getString("username"), "Bret");

	    }

	}


