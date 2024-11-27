package com.jsp.collections.hashing;

public class Node {
     int key;
     Node next;
     
	public Node(int key) {
		super();
		this.key = key;
	}
	public Node(int key, Node next) {
		super();
		this.key = key;
		this.next = next;
	}  
}
