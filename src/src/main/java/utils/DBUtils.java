package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {

    public static ResultSet executeQuery(String query) throws Exception {

        Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=HRDB",
                "dbuser",
                "dbpassword"
        );

        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
}
