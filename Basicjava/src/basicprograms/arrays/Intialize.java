package basicprograms.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Intialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]a=new int[3][];
//        Scanner sc=new Scanner(System.in);
//        int c=sc.nextInt();
        for(int i=0;i<a.length;i++) {
        	
        	for(int j=0;j<a[i].length;j++) {
        		System.out.println("enter a array "+i+  "   index  "+"and a[i] array "+j+"   index value");
        		a[i][j]=new Scanner(System.in).nextInt();
        	}
        }
        a[1][1]=99;
        System.out.println("==========================");
        for(int [] b:a) {
			
			System.out.println(Arrays.toString(b));
			
		}
        
	}

}
