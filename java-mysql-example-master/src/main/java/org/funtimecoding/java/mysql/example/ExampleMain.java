package org.funtimecoding.java.mysql.example;

import java.sql.*;

public class ExampleMain {
    public static void main(String[] args) {
        ExampleMain main = new ExampleMain();
    //    String url = "jdbc:mysql://localhost:3306/interns_app";
    //    String username = "root";
     //    String password = "reddy";

        try {
            main.run();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void run() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
      //  Connection connection = null;
        Statement statement = null;
      
        String username1 = "root";
        String password1 = "reddy";

      String url;
		//  Connection connection = DriverManager.getConnection("dbc:mysql://localhost:3306/?user=root&password=reddy&zeroDateTimeBehavior=convertToNull");
      
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?user=root&password=reddy&zeroDateTimeBehavior=convertToNull");
      
    
       

         statement = connection.createStatement();
         // 1. Connect to the MySQL database
      //   connection = DriverManager.getConnection(url, username1, password1);
        
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
        System.out.println("Printing schema for table: " + resultSet.getMetaData().getTableName(1));
        int columnCount = resultSet.getMetaData().getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(i + " " + resultSet.getMetaData().getColumnName(i));
        }

        System.out.println("Searching for example user.");
        boolean exampleUserFound = false;

        while (resultSet.next()) {
            String username = resultSet.getString("name");

            if (username.equals("shiin")) {
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                Timestamp updatedAt = resultSet.getTimestamp("updated_at");
                System.out.println("Example user found.");
                System.out.println("Name: " + username);
                System.out.println("Created at: " + createdAt);
                System.out.println("Updated at: " + updatedAt);
                exampleUserFound = true;

                break;
            }
        }

        if (!exampleUserFound) {
            System.out.println("Example user not found. Inserting a new user.");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO example.user (name, password, created_at) VALUES (?, ?, ?)");
            preparedStatement.setString(1, "shiin");
            preparedStatement.setString(2, "insecure");
            preparedStatement.setTimestamp(3, new Timestamp(new java.util.Date().getTime()));
            preparedStatement.executeUpdate();
        }
    }
}
