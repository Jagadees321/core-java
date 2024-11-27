package com.jsp.Queuelist;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue a=new Queue();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		a.add(2, 6);
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		System.out.println("---------------");
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println("-----------------");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
