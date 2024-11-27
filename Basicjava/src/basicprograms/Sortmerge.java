package basicprograms;

import java.util.Arrays;

public class Sortmerge {
	public static int[] merge(int[] a, int[] b,int[]c) {
		// TODO Auto-generated method stub
		int i=0; int j=0; int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				k++;
				j++;
			}
			else {
				c[k]=a[i];
				i++;
				k++;
			}
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
		return c;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {2,5,5};
		int[] c=new int[a.length+b.length];
		System.out.println(Arrays.toString(merge(a, b,c)));
	}
}
