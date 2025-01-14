package com.jsp.collections.hashing;

public class Hashset {
	private Node[] a=new Node[10];
	private int count=0;
	
	public boolean add(int k) {
		int index=k%a.length;
		if(a[index]==null) {
			a[index]=new Node(k);
			count++;
			return true;
		}
		Node prev=null;
		Node curr=a[index];
		while(curr!=null) 
		{
			if(curr.key==k) 
			{
				return false;
			}
			prev=curr;
			
			curr=curr.next;
		}
		prev.next=new Node(k);
		count++;
		return true;
	}
	
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}

}
