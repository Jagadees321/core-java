package com.jsp.collections.binarytree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarytree b=new Binarytree();
		b.add(10);
		b.add(5);
		b.add(3);
		b.add(4);
		b.add(12);
		b.add(11);
		b.add(13);
		
//		System.out.println(b.size());
//		b.levelOrder();
//		System.out.println("----------------------------------");
//		b.preOrder();
//		System.out.println("----------------------------------");
//		b.postOrder();
//		System.out.println("----------------------------------");
		b.inOrder();
		
		
		

	}

}