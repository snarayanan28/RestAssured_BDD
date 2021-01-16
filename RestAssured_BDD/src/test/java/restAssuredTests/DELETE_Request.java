package restAssuredTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DELETE_Request {
	//	doDelete() Request
	@Test
	public void do_delete()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/V1";
		RestAssured.basePath = "/delete/38";
		
		given()		
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK");
	}
	
}
