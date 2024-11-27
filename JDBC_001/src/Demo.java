import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   // 1step
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 //connection
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Jaggu@123");
	 //step 3
	 Statement st=con.createStatement();
	 //step 4
	 st.execute("CREATE TABLE CRICKET(ID INT PRIMARY KEY,NAME VARCHAR(15));");
	 con.close();
	 System.out.println("success");
	 
	 
}
}
