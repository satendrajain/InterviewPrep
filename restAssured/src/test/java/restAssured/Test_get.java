package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_get {

	@Test
	public void test_01() {
		given().get("https://reqres.in/api/users?page=2").then()
		.statusCode(200).body("data.id[8]", equalTo(8)).
		log().all();
		
	}

} 
