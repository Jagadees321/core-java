package com.filehandling1;
import java.io.File;
import java.io.IOException;
public class File1 {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\jagga jsp\\File\\file.txt");
		System.out.println(f.exists());
		//System.out.println(f.createNewFile());
		System.out.println(f.mkdir());
		System.out.println(f.createNewFile());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());

	}

}
