package placement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Callableget {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_002","root","Jaggu@123");
		CallableStatement cs=con.prepareCall("{call getemp()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			int roll=rs.getInt(1);
			String name=rs.getString(2);
			int sal=rs.getInt(3);
			System.out.println("roll       : "+roll);
			System.out.println("name       : "+name);
			System.out.println("gender     : "+sal);	
			System.out.println("===============================");	
		}
		con.close();
		System.out.println("success");

	}

}
