package com.jsp.Doublelinked;

public class Double {
	private Node first=null;
	private int count=0;
	private Node last;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		
		//Node curr=first;
		//while(curr.next!=null) {
		//	curr=curr.next;
			
		//}
		
		last.next=new Node(e,last ,null);
		last=last.next;
		count++;
		
		
		
		
	}
	public int size() {
		return count;
	}
	public void get1() {
		Node curr=first;
		//System.out.println(curr.prev);
		//System.out.println(curr);
		//System.out.println(curr.next);
		//System.out.println(curr.e);
		//System.out.println("------------------2");
		while(curr.next!=null) {
			System.out.println("prev-"+curr.prev);
			System.out.println("curr-"+curr);
			System.out.println("next-"+curr.next);
			System.out.println("e-"+curr.e);
			System.out.println("------------------");
			curr=curr.next;
		}
		System.out.println(curr.prev);
		System.out.println(curr);
		System.out.println(curr.next);
		System.out.println(curr.e);
		System.out.println("------------------");
	}
	public Object getobj(int n) {
		if(n<=-1 || n>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<n;i++) {
			curr=curr.next;
		}
		return curr.e;
		
	}
	public void reverse() {
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
	    while(curr.prev!=null) {
	    	System.out.println(curr.e);
	    	curr=curr.prev;
	    }
	    System.out.println(curr.e);
	   
		
	}
	public void add(int ind,Object e)  {
		if(ind>=size() || ind<=-1) {
			throw new IndexOutOfBoundsException();
			
		}
		if(ind==0) {
			Node n=new Node(e,null,first);
			first.prev=n;
			first=n;
		}
		Node curr=first;
		for(int i=1;i<ind;i++) {
			curr=curr.next;
		}
		Node n=new Node(e,curr,curr.next);
		
		curr.next.prev=n;
		curr.next=n;
		
	}
	public void backward() {
		Node curr=last;
		while(curr!=null) {
			System.out.println(curr.e+"  ");
			curr=curr.prev;
		}
		System.out.println();
	}
	public void forward() {
		Node curr=first;
		while(curr!=null) {
			System.out.println(curr.e+"  ");
			curr=curr.next;
		}
		System.out.println();
	}

}