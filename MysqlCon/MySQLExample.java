import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class MySQLExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password for MySQL database
        String jdbcUrl = "jdbc:mysql://localhost:3306/interns_app";
        String username = "root";
        String password = "reddy";

        // Create connection objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
       	//Class.forName("com.mysql.cj.jdbc.Driver");
      // 	Class.forName("com.mysql.jdbc.Driver");
        //	Class.forName("com.mysql.jdbc.Driver");
        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }	
       
            // 1. Connect to the MySQL database
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 2. Create a statement object
            statement = connection.createStatement();

            // 3. Execute a SQL query to retrieve data from the table
            String sqlQuery = "SELECT * FROM courses";
            resultSet = statement.executeQuery(sqlQuery);

            // 4. Process the result set
            while (resultSet.next()) {
                // Retrieve values from the result set
                int courseId = resultSet.getInt("id");
                String courseName = resultSet.getString("description");
                // You can retrieve other columns similarly

                // Display the values
                System.out.println("Course ID: " + courseId + ", Course Name: " + courseName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Close the connection, statement, and result set
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
