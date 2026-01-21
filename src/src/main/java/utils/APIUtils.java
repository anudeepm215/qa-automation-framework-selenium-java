package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIUtils {

    public static Response getEmployee(int empId) {
        return RestAssured
                .given()
                .baseUri("https://api.example.com")
                .when()
                .get("/employees/" + empId);
    }
}
