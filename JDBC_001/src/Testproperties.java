import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("person.properties");
		Properties p=new Properties();
		p.load(fis);
		String name=p.getProperty("name");
		String gender=p.getProperty("gender");
		int age=Integer.parseInt(p.getProperty("age"));
		System.out.println("name    : "+name);
		System.out.println("gender  : "+gender);
		System.out.println("age     : "+age);
		

	}

}
