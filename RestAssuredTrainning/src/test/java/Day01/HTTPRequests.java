package Day01;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

/**
 * Mainly 3 keywords used in gherkin language 
 * prerequisite is requirements or conditions that must be met before starting something.
 * given() --> Prerequisite --> set cookies, add auth , add param, set header
 * when()--> get, post, put, delete.
 * then()---> validation status code, extract response, exract, header cookies response body. 
 */

public class HTTPRequests {
	
	int id;
	//@Test(priority = 1)
	void getUsers() {
		given()
		
		.when()
				.get("https://reqres.in/api/users?page=2")
		.then()
				.statusCode(200)
				.body("page",equalTo(2))
				.log().all();
	}
	
	@Test(priority = 2)
	void createUser() {

	    HashMap data = new HashMap ();
	    data.put("name", "pavan");
	    data.put("job", "trainer");

	    id = given()
	        .contentType("application/json")
	        .header("x-api-key", "reqres-free-v1") // ✅ Add your API key here
	        .body(data)
	    .when()
	        .post("https://reqres.in/api/users")
	        .jsonPath().getInt("id");
	        
	    
	   // .then()
	       // .log().all()
	       // .statusCode(201);  // ✅ Expecting 201 Created
	

	}
	@Test (priority=3)
	void updateUser() {
		
	}
}




