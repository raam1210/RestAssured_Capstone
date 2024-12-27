import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class GetEmployeeTest extends BaseTest {
	
    public static void getEmployee(String id) {
        Response response = given().log().all()
                .get("/HCLEmployee/" + id);

        response.then().statusCode(200);
        assert response.jsonPath().getString("Employee Name").equals("Raam");
        assert response.jsonPath().getString("Location").equals("Chennai");

        System.out.println("Retrieved Employee: " + response.getBody().asString());
    }
}
