package com.filehandling;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CanWritemulti {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("D:\\\\jagga jsp\\\\javascript\\\\jagga.txt");
		BufferedWriter bf=new BufferedWriter(f);
		bf.write("jagadeesh");
		bf.newLine();
		bf.write("royal");
		bf.close();
		
		

	}

}
