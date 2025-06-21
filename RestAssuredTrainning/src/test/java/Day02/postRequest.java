package Day02;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.Test;

public class postRequest {

    @Test(priority = 1)
    void testUsingHashMap() {
        System.out.println("==== Starting POST Test using HashMap ====");  // <-- Console output

        HashMap<String, Object> data = new HashMap<>();
        data.put("name", "Scott");
        data.put("location", "France");
        data.put("phone", "123456");
        data.put("id", "4");

        String[] courseArr = {"C", "C++"};
        data.put("courses", courseArr);

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

        System.out.println("==== POST Request Completed ====");
    }

    @Test(priority = 2)
    void testDelete() {
        System.out.println("==== Starting DELETE Test ====");  // <-- Console output

        given()

        .when()
            .delete("http://localhost:3000/students/4")

        .then()
            .statusCode(200)
            .log().all();

        System.out.println("==== DELETE Request Completed ====");
    }
}
