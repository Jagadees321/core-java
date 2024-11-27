package com.jsp.Arraylist.linkedlist;

public class LinkedList2 {
	private Node2 first=null;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node2(e,null,null);
			count++;
			//System.out.println(first.next);
			//System.out.println(first.prev);
			return;
		}
		Node2 curr=first;
		if(size()<=1){
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=new Node2(e,null,null);
			count++;
			//System.out.println(curr.next);
			//System.out.println(curr.prev);
			return;
		}
		while(curr.next!=null) {
			curr=curr.next;
			curr.prev=curr;
		}
		curr.next=new Node2(e,null,curr.prev);
		count++;
		//System.out.println(curr.next);
		//System.out.println(curr.prev);
		
	}
	public Object get(int n) {
		if(n<=-1 || n>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node2 curr=first;
		for(int i=1;i<=n;i++) {
		curr=curr.next;
		}
		return curr.e;
	}
	public int size() {
		return count;
	}
	public void add(Object e,int index) {
		if(index==0) {
			Node2 n=new Node2(e,first,null);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node2 curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node2 n=new Node2(e,curr.next,curr);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	
}




























