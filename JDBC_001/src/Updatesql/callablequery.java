package Updatesql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class callablequery {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
		CallableStatement cs=con.prepareCall("{call save_std(107,'ashwin','male',9876556784)}");
		cs.execute();
		con.close();
		System.out.println("success");

	}

}
