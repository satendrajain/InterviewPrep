package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import java.util.HashMap;
import java.util.Map;


public class Test_post {
	
	@Test
	public void test_post() {
		Map<String ,Object> map = new HashMap<String, Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
	//	System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		
		given().
		header("content-type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		
		body(request.toJSONString()).when()
		.post("https://reqres.in/api/users").then().statusCode(201);
	}

}
