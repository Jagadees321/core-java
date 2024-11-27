package com.jsp.Arraylist.linkedlist;

public class Test2 {

	public static void main(String[] args) {
		LinkedList2 l=new LinkedList2();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(100, 2);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
