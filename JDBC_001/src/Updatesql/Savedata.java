package Updatesql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Savedata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		FileInputStream fis=new FileInputStream("db.properties");
		Properties p=new Properties();
		p.load(fis);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001",p);
        Statement st=con.createStatement();
        
        String sql="UPDATE student set name='jagadeesh royal' where roll=101";
        st.execute(sql);
        st.close();
        con.close();
        System.out.println("success");
		

	}

}
