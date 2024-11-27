package Updatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001?user=root & password=Jaggu@123");
        Statement st=con.createStatement();
        String sql="UPDATE student set name='jagadeesh' where roll=101";
        st.execute(sql);
        con.close();
        System.out.println("success");
        		
	}

}
