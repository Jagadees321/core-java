package com.jsp.Arraylist.linkedlist;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l=new Linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println(l.get(1));
		l.reverse();
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		

	}

}
