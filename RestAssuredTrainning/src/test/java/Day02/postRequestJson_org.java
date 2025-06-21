package Day02;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class postRequestJson_org {
	
	@Test(priority = 1)
	
	void testPostReqUsingJsonLibrary() {
		
		JSONObject data = new JSONObject();
		
			
					data.put("name","Scott");
					data.put("location","France");
					data.put("phone","123456");
					data.put("id","4");
					String[] courseArr = {"C","C++"};
					data.put("courses", courseArr);
		
		
		
		
		given()
				.contentType("Application/json")
				.body(data.toString())
	
		
		.when()
		
				.post("http://localhost:3000/students")
		
		.then()
				.statusCode(201)
				.body("name", equalTo("Scott"))
				.body("location", equalTo("France"))
				.body("phone", equalTo("123456"))
				.body("courses[0]", equalTo("C"))
				.body("courses[1]", equalTo("C++"))
				.header("Content-Type", "application/json")
				.log().all();

	}
	
	@Test(priority = 2)
	void testdelete() {
		
		given()
		
		.when()
			.delete("http://localhost:3000/students/4")
		.then()
			.statusCode(200);
		
	}
	

}
