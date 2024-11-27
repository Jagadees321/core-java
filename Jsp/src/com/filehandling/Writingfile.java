package com.filehandling;

//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.io.FilterOutputStream;

public class Writingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f= new FileOutputStream("D:\\jagga jsp\\javascript\\ab.txt");
		String s="jspiders jagadeesh";
		byte[]b=s.getBytes();
		f.write(b);
		f.close();
		

	}

}
