package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\\\jagga jsp\\\\Jsp\\jagga\\jagga1.txt");
		f.createNewFile();
		System.out.println(f.exists());
		char []a=new char[10];
		@SuppressWarnings("resource")
		FileReader r=new FileReader(f);
		
		System.out.println(r.ready());
		r.read(a);
		System.out.println(a);

	}

}
