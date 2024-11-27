package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseofsuminLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(2,4,3);
		List<Integer> l1=Arrays.asList(5,6,4);
		List<Integer> res=addTwoNumbers(l,l1);
		System.out.println(res);
		

	}
    public static List<Integer> addTwoNumbers(List<Integer> l1,List<Integer> l2) {
    	String n1="";
    	String n2="";
    	for(int a : l1) {
    		n1+=a;
    	}
    	for(int a : l2) {
    		n2+=a;
    	}
    	int res=Integer.parseInt(n1)+Integer.parseInt(n2);
    	List<Integer> l=new ArrayList<>();
    	
    	while(res>0) {
    		int r=res%10;
    		l.add(r);
    		res=res/10;
    	}
    	return l;
        
        
    }

}
