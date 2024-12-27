import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.response.Response;


public class UpdateEmployeeTest extends BaseTest {
    public static void updateEmployee(String id) {
    	
        JSONObject requestBody = new JSONObject();
        requestBody.put("Location", "Bangalore");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .patch("/HCLEmployee/" + id);

        response.then().statusCode(200);
        assert response.jsonPath().getString("Location").equals("Bangalore");

        System.out.println("Updated Employee: " + response.getBody().asString());
    }
}
