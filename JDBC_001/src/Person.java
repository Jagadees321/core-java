import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Jaggu@123");
	Statement st=con.createStatement();
	st.executeUpdate("create table football(ID INT PRIMARY KEY,NAME VARCHAR(15),age INT)");
	con.close();
}
}
