package com.jsp.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Ioexception {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main start");
		try (FileReader f = new FileReader("D:\\htmlnew\\nav.html")) {
			System.out.println(f.read());
		}
	}

}
