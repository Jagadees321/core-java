package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer>a=new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        Queue<Integer> a1=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        for(int i=1;i<=3;i++) {
        	s.push(a.poll());
        }
        while(!s.isEmpty()) {
        	a1.add(s.pop());
        }
        for(int k:a) {
        	a1.add(k);
        }
     
        	

        System.out.println(a);        
        System.out.println(a1);
        
	}

}