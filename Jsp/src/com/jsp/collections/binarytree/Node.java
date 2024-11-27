package com.jsp.collections.binarytree;

public class Node {
	int key;
	Node left;
	Node right;
	Node(int k){
		this.key=k;
	}
	public Node(int key, Node left, Node right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
	

}
