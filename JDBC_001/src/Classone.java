import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Classone {

	public static void main(String[] args) throws Exception {
//		==>5 steps
//		1. load and register driver
//		2. establish connection
//		3. establish statement
//		4. create and excute query
//		5.close connection
		
		
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
	
		Statement st=con.createStatement();
		
        String sql="INSERT INTO student VALUES(103,'viru','male',6303860945)";
        st.execute(sql);
        
        con.close();
        
        System.out.println("student data succussfully stored");
        
	}

}
