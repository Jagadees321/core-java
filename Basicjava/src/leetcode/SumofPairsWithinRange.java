package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SumofPairsWithinRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<int[]> a= pairs(new int[] {2,3,4,5}, 5, 7);
//		for(int[] b:a) {
//			System.out.println(Arrays.toString(b));
//		}
		System.out.println(pairs(new int[] {2,3,4,5}, 5, 7));
		
	}
	public static int pairs(int[] a,int l,int r) {
		ArrayList<int[]> al=new ArrayList<>();
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(l<=(a[i]+a[j]) && a[i]+a[j]<=r  ){
					al.add(new int[] {a[i],a[j]});
				}
			}
		}
		return al.size();
	}
}