package Day02;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
public class postRequestUsingJSONFile {

	


		
		@Test(priority = 1)
		
		void testPostReqUsingJsonfile() throws FileNotFoundException {
			
			File f = new File (".\\body.json");
			FileReader fr = new FileReader(f);
			
			JSONTokener jt = new JSONTokener(fr);
			
			JSONObject data = new JSONObject(jt);
			
			given()
					.contentType("application/json")
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


