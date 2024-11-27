package arrays1;

import java.util.Arrays;

public class Sumtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3,7,15};
		int[]b=twosum(a,9);
		System.out.println(Arrays.toString(b));

	}
	public static int[] twosum(int []a,int tar) {
		int [] b=new int[2];
		for(int i=0;i<a.length-1;i++) {
			int f=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(f+a[j]==tar) {
					b[0]=i;
					b[1]=j;
				}
			}
		}
		return b;
	}

}
