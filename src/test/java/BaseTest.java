import io.restassured.RestAssured;

public class BaseTest {
    static {
        RestAssured.baseURI = "http://localhost:3000";
    }
}
