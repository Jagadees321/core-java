package com.jsp.Arraylist.linkedlist;

public class Linkedlist {
	private Node first=null;
	private int count;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		 curr.next=new Node(e,null);
		count++;
	}
	public int size() {
		return count;
		
	}
	public Object get(int n) {
		if(n<=-1 || n>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<=n;i++) 
		{
		    curr=curr.next;
		
		}
		return curr.e;
	}
	public void add(int ind,Object e) {
		if(ind>=size() || ind<=-1) {
			throw new IndexOutOfBoundsException() ;
	
			
		}
		Node curr=first;
		if(ind==0) {
			first=new Node(e,first);
			count++;
		}
		for(int i=1;i<ind;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
	}
	public void remove(int ind) {
		if(ind>=size() || ind<=-1) {
			throw new IndexOutOfBoundsException() ;
	
			
		}
		Node curr=first;
		if(ind==0) {
			first=first.next;
			count--;
		}
		for(int i=1;i<ind;i++) {
			curr=curr.next;
		}
		curr=curr.next.next;
	}
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		
		first=prev;
	}

}
