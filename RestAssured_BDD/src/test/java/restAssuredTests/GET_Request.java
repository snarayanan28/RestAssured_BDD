package restAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_Request {
/*	@Test
	public void getWeatherDetails()	{
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Chennai")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City", equalTo("Chennai"))
			.header("Content-Type", equalTo("application/json"))
			.log().all();
	}	*/
	
	//	doGet() Request
	@Test
	public void doGet()
	{
		given()
		.when()
			.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.header("Content-Type", equalTo("application/json;charset=utf-8"))
			.log().all();
	}
}
