package com.filehandling;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Bufferedinput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(b.readLine());
		
		System.out.println(n);

	}

}
