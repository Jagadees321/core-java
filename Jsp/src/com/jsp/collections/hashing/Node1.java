package com.jsp.collections.hashing;

public class Node1 {
	Object key;
    Node1 next;
    
	public Node1(Object key) {
		super();
		this.key = key;
	}
	public Node1(Object key, Node1 next) {
		super();
		this.key = key;
		this.next = next;
	}

}
