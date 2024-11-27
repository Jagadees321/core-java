package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\jagga jsp\\javascript\\a.txt");
		System.out.println(f.mkdir());
		System.out.println(f.createNewFile());
		//System.out.println(f.createNewFile());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());

	}

}
