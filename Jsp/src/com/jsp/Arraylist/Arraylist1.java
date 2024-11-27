package com.jsp.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//import java.io.PrintStream;
//import java.util.Arrays;

public class Arraylist1 {

	private Object[] a;
	private int p;
	private Arraylist1(){
		a=new Object[15];
		p=0;
		
	}
	public void add(Object e) {
		if((p>=a.length)) increace();
		 a [p++]=e;
	}
	private void increace() {
		Object[] temp=new Object[a.length+2];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
		
	}
	public int size() {
		return p;
	}
	public Object get(int ind) {
		if(ind >=p || ind<=-1) {
			throw new ArrayIndexOutOfBoundsException() ;
		}
		return a[ind];
	}
	private void add(int ind,Object e){
		if(ind >=size() || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		if((p>=a.length)) increace();
		for(int i=(size()-1);i>=ind;i--) {
			a[i+1]=a[i];
		}
		a[ind]=e;
		p++;
	}
	private void remove(int ind) {
		if(ind >=p || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=ind+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
		
		
	}
	public void change(int ind,Object e) {
		if(ind>=p || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length) increace();
//		for(int i=a.length-1;i>=0;i--) {
//			a[p+1]=a[p];
//		}
		a[ind]=e;
		p++;
	}
	public void removeobj( Object e) {
		
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				ind=i;
			}
		}
		
		for(int i=ind+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
		
	}
	
	public static void change() {
		String s="";
		int a=0;
		int b=0;
		String substring = s.substring(1);
		String[] sp = substring.split("[*+-/]");
		System.out.println(sp);
	}
	public static void main(String[] args) {
		Arraylist1 a4=new Arraylist1();
//		Arraylist1 a2=new Arraylist1();
		
		
		ArrayList a=new  ArrayList<>();
	
		
		
		for(Object o:a4.a) {
			if(o!=null) {
				System.out.println(o);
			}
		}
	
		
		
		
	}
}
