package basicprograms.arrays;

import java.util.Arrays;

public class Inti2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumodd(a));
        
	}
	
	public static int sum(int[][] a) {
		int sum=0;
		for(int [] b:a) {
			for(int c:b) {
				sum+=c;
			}
			
		}
		return sum;
	}
	public static int sumodd(int[][] a) {
		int sum=0;
		for(int [] b:a) {
			for(int c:b) {
				if(c%2!=0) 
					
				
				sum+=c;
			}
			
		}
		return sum;
	}

}
