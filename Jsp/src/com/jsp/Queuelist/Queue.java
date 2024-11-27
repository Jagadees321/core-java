package com.jsp.Queuelist;


public class Queue {
	
	private Node1 first=null;
	private Node1 last;
	//private Object e;
	private int c=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node1(e,null);
			last=first;
			c++;
			return;
		}
		last.next=new Node1(e,last);
		last=last.next;
		c++;
	}
	public int size() {
		return c;
	}
	public boolean isEmpty() {
		return c==0;
	}
	public Object peek() {
		if(c==0) return null;
		return first.e;
		
	}
	public Object poll() {
		if(c==0) return null;
		Object e=first.e;
		first=first.next;
		if(first==null) last=null;
		return e;
	}
	public Object get(int n) {
		if(n<=-1 || n>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node1 curr=first;
		for(int i=1;i<=n;i++) {
		curr=curr.next;
		
		}
		return curr.e;
		
	}
	public void add(int ind,Object e) {
		if(ind>=size() || ind<=-1) {
			throw new IndexOutOfBoundsException() ;
	
			
		}
		Node1 curr=first;
		if(ind==0) {
			first=new Node1(e,first);
			c++;
		}
		for(int i=1;i<ind;i++) {
			curr=curr.next;
		}
		curr.next=new Node1(e,curr.next);
		c++;
	}
	public void remove(int ind) {
		if(ind>=size() || ind<=-1) {
			throw new IndexOutOfBoundsException() ;
	
			
		}
		Node1 curr=first;
		if(ind==0) {
			first=first.next;
			c--;
		}
		for(int i=1;i<ind;i++) {
			curr=curr.next;
		}
		curr=curr.next.next;
	}
	public void reverse() {
		Node1 prev=null;
		Node1 curr=first;
		Node1 next=null;
		
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		
		first=prev;
	}
    
}
