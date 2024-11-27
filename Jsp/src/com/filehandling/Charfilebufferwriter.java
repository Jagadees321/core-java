package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Charfilebufferwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("D:\\\\jagga jsp\\\\javascript\\\\jagga.txt",true);
		BufferedWriter bf=new BufferedWriter(f);
        char[]ch={'a','b','c'};
        bf.write(ch);
        bf.close();
	}
    
}
