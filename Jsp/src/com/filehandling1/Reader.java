package com.filehandling1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\jagga jsp\\File\\file5.txt");
		f.createNewFile();
//		System.out.println(f.canExecute());
//		System.out.println(f.canWrite());
//		System.out.println(f.canRead());
//		System.out.println(f.getAbsolutePath());
		
//		FileWriter w=new FileWriter(f);
//		//w.write("hello jagadeesh");
////		w.write("abc");
////		char []a= {'a','b','c'};
//		w.write(655497);
////		w.write(a);
		
//		w.close();
//		BufferedWriter b=new BufferedWriter(new FileWriter("D:\\jagga jsp\\File\\file5.txt",true));
//		b.write("Hello royals");
//		char []a= {'a','b','c'};
//		b.write(a);
//		b.newLine();
//		b.write(9765);
//		b.newLine();
//		b.write("i am jagadeesh");
//		b.close();
//		
        FileReader f1=new FileReader("D:\\jagga jsp\\File\\file1.txt");
           int i=(char)f1.read();
//         
 //       System.out.println((char)i);
//       
//       while(i>0) {
//        	char c=(char)i;
//        	System.out.print(c);
//        	i= f1.read();
//        }
//        f1.close();
//        
        BufferedReader b=new BufferedReader(new FileReader("D:\\jagga jsp\\File\\file1.txt"));
       System.out.println(b.lines());
          b.readLine();
          
        String l=b.readLine();
        
        System.out.println(b.readLine());
        while(l!=null) {
        	System.out.println(l);
        	l=b.readLine();
		
        }
		
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String s1=s.nextLine();
			System.out.println(s1);
		}
		s.close();
	}
}
