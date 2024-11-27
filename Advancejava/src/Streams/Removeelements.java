package Streams;

import java.util.Arrays;

public class Removeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {3,2,3,2};
        int j=0;
        for(int i=0;i<a.length;i++) {
        	if(a[i]!=3) {
        		a[j++]=a[i];
        	}
        }
        System.arraycopy(a, 0, a, 0, j);
        System.out.println(Arrays.toString(a));
        j= -0;
        System.out.println(j);
	}

}
