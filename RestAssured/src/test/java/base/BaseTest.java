package base;

import io.restassured.RestAssured;

public class BaseTest {
	
	

	    public void setup()
	    {

	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	    }

	}


