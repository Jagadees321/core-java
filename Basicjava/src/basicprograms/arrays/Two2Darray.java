package basicprograms.arrays;

import java.util.Arrays;

public class Two2Darray {

	public static void main(String[] args) {
		
		int[][] a=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=11;
		a[1][1]=22;
		a[1][2]=33;
		
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]+" index o array  "+Arrays.toString(a[0]));
		System.out.println(a[1]+" index 1 array  "+Arrays.toString(a[1]));
		System.out.println("==========================");
		for(int [] b:a) {
			System.out.println(b);
			System.out.println(Arrays.toString(b));
			System.out.println("==========================");
		}
		System.out.println("========44444444444444444444s==================");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(Arrays.toString(a[i]));
			System.out.println("==========================");
		}

	}

}