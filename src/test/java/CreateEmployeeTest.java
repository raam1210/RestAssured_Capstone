import io.restassured.response.Response;
import pojo.Employee;

import static io.restassured.RestAssured.given;

import java.util.Arrays;

public class CreateEmployeeTest extends BaseTest {
    public static String employeeId;

    public static void createEmployee() {
    	
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeName("Raam");
        newEmployee.setLocation("Chennai");
        newEmployee.setSapCode(5994300);
        newEmployee.setSkill(Arrays.asList("Java", "Rest Assured"));
        

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .body(newEmployee)
                .post("/HCLEmployee");

        response.then().log().all().statusCode(201);
        assert response.jsonPath().getString("Employee Name").equals("Raam");
        assert response.jsonPath().getString("Location").equals("Chennai");

        employeeId = response.jsonPath().getString("id");
        System.out.println("Created Employee ID: " + employeeId);
    }
}
