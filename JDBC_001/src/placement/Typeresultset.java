package placement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Typeresultset {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_002", "root", "Jaggu@123");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("SELECT * FROM emp");
		rs.afterLast();
		rs.beforeFirst();
		
		while (rs.next()) {
			
			System.out.print(rs.getInt(1) + "  ");
			System.out.print(rs.getString(2) + "  ");
			System.out.println(rs.getInt(3) + "  ");

		}
		System.out.println("==================================================");
		while (rs.previous()) {

			System.out.print(rs.getInt(1) + "  ");
			System.out.print(rs.getString(2) + "  ");
			System.out.println(rs.getInt(3) + "  ");

		}

		con.close();
		System.out.println("success");

	}

}
