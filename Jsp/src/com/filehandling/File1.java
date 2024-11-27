package com.filehandling;
import java.io.File;
public class File1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("jagga");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.canExecute());
        System.out.println(f.getAbsolutePath());
	}

}
