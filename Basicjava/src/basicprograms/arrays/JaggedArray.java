package basicprograms.arrays;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int outersize=4;
		int[][]a=new int[4][];
		
//        System.out.println(a);// a reference
//        //tostring object reference kakunda object values print chasthadi
//        System.out.println(Arrays.toString(a[3]));// what is output?
		//1 st array ki i+1 size a array ki 1
		//2 ki 2
		//3 ki 4
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter inner array size "+ i+" outer array");
			a[i]=new int[new Scanner(System.in).nextInt()];
			
		}
		for(int []b:a) {
			System.out.println(Arrays.toString(b));
		}
	}
	
	
	

}
