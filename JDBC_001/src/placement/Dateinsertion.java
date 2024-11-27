package placement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

public class Dateinsertion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
//		Statement st=con.createStatement();
//		String sql="INSERT INTO emp VALUES(1,'AA','2000-03-31');";
//		st.execute(sql);
		PreparedStatement ps=con.prepareStatement("INSERT INTO emp VALUES(?,?,?)");
		ps.setInt(1, 3);
		ps.setString(2, "cc");
		//to find date
//		Date d=new Date();v .
//		long time=d.getTime();
//		java.sql.Date dt=new java.sql.Date(time);
//		ps.setDate(3, dt);
		//to costumdate
		java.sql.Date cd=java.sql.Date.valueOf("2001-8-31");
		ps.setDate(3, cd);
		ps.execute();
		
		con.close();
		System.out.println("success");

	}

}
