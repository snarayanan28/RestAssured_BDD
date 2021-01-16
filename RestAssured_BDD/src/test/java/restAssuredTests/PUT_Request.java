package restAssuredTests;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SuppressWarnings("unused")
public class PUT_Request {
	@SuppressWarnings("rawtypes")
	public static HashMap map = new HashMap();
	String empName = RestUtils.empName();
	String empSalary = RestUtils.empSal();
	String empAge = RestUtils.empAge();
		
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void inputData()
	{
		map.put("name",empName);
		map.put("salary",empSalary);
		map.put("age",empAge);
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/49";		
	}
	
	//	doPut() Request
	@Test
	public void doPut()
	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.and()
			.body("status", equalTo("success"))
			.log().all();
	}
}
