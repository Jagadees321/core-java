package Updatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SavedatausingPS {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_001","root","Jaggu@123");
		PreparedStatement ps=con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
        boolean flag=true;
        while(true) {
        	System.out.println("enter the student roll num");
        	int roll=sc.nextInt();
        	sc.nextLine();
        	System.out.println("enter stu name");
        	String name=sc.nextLine();
        	System.out.println("enter gender");
        	String gender=sc.nextLine();
        	System.out.println("enter num");
        	Long phone=sc.nextLong();
        	ps.setInt(1, roll);
        	ps.setString(2, name);
        	ps.setString(3, gender);
        	ps.setLong(4, phone);
        	
        	ps.execute();
        	System.out.println("success");
        	char c=sc.next().charAt(0);
        	if(c=='y' || c=='Y') {
        		flag=false;
        	}
        	
        }
     //   con.close();
	}

}
