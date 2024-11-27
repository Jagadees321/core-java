package placement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Callablesave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_002","root","Jaggu@123");
		CallableStatement cs=con.prepareCall("{call saveemp(188,'ashwin',1400)}");
		int res=cs.executeUpdate();
		System.out.println(res);
		con.close();
		System.out.println("success");

	}

}
