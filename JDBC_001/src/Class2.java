import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Class2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
//		Driver d=new Driver();
//		DriverManager.registerDriver(d);
		java.sql.Driver d=new Driver();
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
        Statement st=con.createStatement();
        String sql="CREATE TABLE JAGA(ID int primary key,name varchar(15));";
        st.execute(sql);
        con.close();
        System.out.println("success");
	}

}
