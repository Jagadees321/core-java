package com.filehandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Canwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\\\jagga jsp\\\\javascript\\\\jagga.txt");
		FileOutputStream a=new FileOutputStream(f); 
		String s="jagadeesh royal";
		byte[]b=s.getBytes();
		if(f.canExecute()) {
			a.write(b);
		}
		else {
			System.out.println("cant write");
		}
		a.close();

	}

}

