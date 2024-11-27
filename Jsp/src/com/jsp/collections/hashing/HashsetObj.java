package com.jsp.collections.hashing;

public class HashsetObj {
	Node1 []a=new Node1[10];
	private int count=0;
	public boolean add(Object key) {
		int hc=Math.absExact(key.hashCode());
		int index=hc%a.length;
		while(a[index]==null) {
			a[index]=new Node1(key);
			count++;
			return true;
		}
		@SuppressWarnings("unused")
		Node1 prev=null;
		Node1 curr=a[index];
		while(curr!=null) {
			if(key.equals(curr.key)) {
				return false;
			}
			curr=curr.next;
			
		}
		prev=new Node1(key);
		count++;
		
		return true;
	}
	public int size() {
		return count;
	}
	public void display() {
		
		for(int i=0;i<a.length;i++) {
			Node1 curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
	}

}
