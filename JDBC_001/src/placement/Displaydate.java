package placement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Displaydate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM emp");
        
        System.out.print(String.format("%-15s", "ID"));
        System.out.print(String.format("%-15s", "NAME"));
        System.out.print(String.format("%-15s", "DATE")+"\n");
        
        System.out.print(String.format("%-15s", "=="));
        System.out.print(String.format("%-15s", "===="));
        System.out.print(String.format("%-15s", "====")+"\n");
        
        while(rs.next()) {
        	System.out.print(String.format("%-15s", rs.getInt(1)));
            System.out.print(String.format("%-15s", rs.getString(2)));
            System.out.print(String.format("%-15s", rs.getDate(3))+"\n");
        }
        con.close();
        
	}

}
