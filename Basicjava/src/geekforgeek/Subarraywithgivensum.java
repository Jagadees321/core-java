package geekforgeek;

import java.util.ArrayList;

public class Subarraywithgivensum {
	static ArrayList<Integer> subarray(int[] a,int s){
		int sum=0;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=i;j<a.length;j++) {
			
				if(sum<s) {
					sum+=a[j];
				}
				if(s==sum) {
					
					al.add(i);
					al.add(j);
					return al;
				}
				else if(sum>s) {
					break;
				}
				
				
				
			}
		}
		return al;
		
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(subarray(a,9));
	}

}
