package restAssuredTests;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class POST_Request {
	@SuppressWarnings("rawtypes")
	public static HashMap map = new HashMap();
	
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void inputData()	{
		map.put("name", RestUtils.empName());
		map.put("salary", RestUtils.empSal());
		map.put("age", RestUtils.empAge());		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/create";		
	}
	
	//	doPost() Request
	@Test
	public void doPost()	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(200)
			.and()
			.body("status", equalTo("success"))
			.log().all();
	}
}
