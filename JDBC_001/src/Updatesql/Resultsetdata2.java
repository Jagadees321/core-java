package Updatesql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Resultsetdata2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
		CallableStatement cs=con.prepareCall("{call gethardik()}");
		ResultSet rs=cs.executeQuery();
		
		while(rs.next()) {
			int roll=rs.getInt(1);
			String name=rs.getString(2);
			String gender=rs.getString(3);
			Long phone=rs.getLong(4);
			
			System.out.println("roll       : "+roll);
			System.out.println("name       : "+name);
			System.out.println("gender     : "+gender);
			System.out.println("phone      : "+phone);
			System.out.println("===============================");
			
		}
		

	}

}
