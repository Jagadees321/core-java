package com.jsp.Doublelinked;

public class Node {
	Node next;
	Node prev;
	Object e;
	Node(Object e,Node prev,Node next){
		this.e=e;
		this.prev=prev;
		this.next=next;
		
	}

}
