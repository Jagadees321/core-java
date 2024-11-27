package placement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
		PreparedStatement ps=con.prepareStatement("DELETE FROM student WHERE phone=?");
		ps.setString(1,"7815975252");
		ps.execute();
		con.close();
		System.out.println("deleted");

	}

}
