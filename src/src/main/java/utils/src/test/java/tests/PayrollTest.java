package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DBUtils;

import java.sql.ResultSet;

public class PayrollTest {

    @Test
    public void verifyPayrollAmountFromDatabase() throws Exception {

        ResultSet resultSet = DBUtils.executeQuery(
                "SELECT salary FROM payroll WHERE emp_id = 101"
        );

        resultSet.next();
        int salary = resultSet.getInt("salary");

        Assert.assertEquals(salary, 50000, "Payroll amount mismatch");
    }
}
