package com.jsp.collections.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
	private Node root;
	private boolean flag;
	private int count;
	
	public boolean add(int k) {
		flag=true;
		root=addNode(root,k);
		return flag;
	}
	public Node addNode(Node n, int k) 
	{
		if(n==null) {
			n=new Node(k);
			count++;
			return n;
		}
		if(n.key>k) {
			n.left=addNode(n.left,k);
		}
		else if(n.key<k) {
			n.right=addNode(n.right,k);
		}
		else {
			flag=false;
		}
		
	
		return n;
	}
	public int size() {
		return count;
	}
	public void levelOrder() {
		System.out.print("level order = ");
		Queue<Node> q=new LinkedList<>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+"  ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	
	public void preOrder() {
		System.out.print("pre order = ");
		preOrderTraverse(root);
		System.out.println();
	}
	private void preOrderTraverse(Node n) {
		if(n==null) return;
		
		System.out.print(n.key+"  ");
		
		preOrderTraverse(n.left);
		preOrderTraverse(n.right);
		
		
	}
	
	public void postOrder() {
		System.out.print("postOrder = ");
		postOrdertravel(root);
		System.out.println();
		
	}
	private void postOrdertravel(Node n) {
		
		if(n==null) return;
		postOrdertravel(n.left);
		postOrdertravel(n.right);
		System.out.print(n.key+" ");
		
	}
	
	public void inOrder() {
		System.out.print("inOrder = ");
		inOrderterverse(root);
		System.out.println();
	}
	private void inOrderterverse(Node n) {
		if(n==null) return;
		
		inOrderterverse(n.left);
	
		System.out.println(n.key+" ");
		inOrderterverse(n.right);
		
	}
	
	public void remove(int k) {
		root=removeNode(root,k);
	}
	private Node removeNode(Node n, int k) {
		if(n==null) {
		return null;
		}
		if(n.key>k) {
			n.left=removeNode(n.left,k);
			return n;
		}
		else if(n.key<k){
			n.right=removeNode(n.right,k);
			return n;
		}
		else {
			if(n.left!=null && n.right!=null) {
				Node maxnode=maxNode(n.left);
				n.key=maxnode.key;	
				n.left=removeNode(n.left,maxnode.key);
				return n;
				
			}
			else if(n.left!=null) {
				return n.left;
			}
			else if(n.right!=null) {
				return n.right;
			}
			else { 
				n=null;
				return n;
			}
		}
		
	}
	private Node maxNode(Node n) {
		if(n.right!=null) {
			return maxNode(n.right);
		}
		return n;
	}

}
