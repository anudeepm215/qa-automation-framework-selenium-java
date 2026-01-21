package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.APIUtils;

public class APITest {

    @Test
    public void verifyGetEmployeeAPI() {
        Response response = APIUtils.getEmployee(101);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
