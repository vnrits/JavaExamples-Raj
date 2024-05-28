import java.sql.*;

class MysqlCon{
public static void main(String args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interns_app","root","reddy");
//here sonoo is the database name, root is the username and root is the password
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from courses");

while(rs.next())
System.out.println(rs.getInt(5)+"  "+rs.getString(6)+"  "+rs.getString(7));

con.close();

}catch(Exception e){
    
}
}
}

// set the temp class path
/*
 * 
 * set classpath=D:\BK-training-2024\backend-samples\Raj-Samples\MysqlCon\mysql-connector-java-5.0.8-bin.jar;
 */
