package Day02;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
public class postRequestUsingPOJOclass {

	


		
		@Test(priority = 1)
		
		void testPostReqUsingPojoclass() {
			
			Pojosetget data = new Pojosetget();
			
				data.setName("Scott");
				data.setLocation("France");
				data.setPhone("123456");
				String [] coursesArr = {"C","C++"};
				data.setCourses(coursesArr);
				data.setId("4");
						
			
			
			
			
			given()
					.contentType("application/json")
					.body(data)
		
			
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


