package restAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class restAssuredTest {
	
	@Test
	public void test_01() {
		Response response =  get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.getCookie("content-type"));
		System.out.println(response.getTime());
		
	}
	
	@Test
	public void Test_02() {
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[0]", equalTo(7));
	} 
	
	

}
