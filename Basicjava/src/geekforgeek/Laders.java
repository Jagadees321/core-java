package geekforgeek;

import java.util.ArrayList;

public class Laders {
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        if(n==0){
            return a;
        }
        
        for(int i=0;i<n-1;i++){
        	boolean b=true;
            for(int j=i+1;j<n;j++) {
            	if(arr[i]<arr[j]) {
            		b=false;
            	}
            }
            if(b)a.add(arr[i]);
            
            
        }
        a.add(arr[n-1]);
        return a;
    }
	
	public static void main(String[] args) {
		
		System.out.println(leaders(new int[] {16,17,4,3,5,2}, 6));
	}
}
