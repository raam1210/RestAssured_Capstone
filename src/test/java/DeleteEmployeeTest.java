import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class DeleteEmployeeTest extends BaseTest {
    public static void deleteEmployee(String id) {
        Response response = given().log().all()
                .delete("/HCLEmployee/" + id);

        response.then().log().all().statusCode(200);

        System.out.println("Deleted Employee with ID: " + id);
    }
}
