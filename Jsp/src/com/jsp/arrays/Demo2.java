package com.jsp.arrays;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= new int[]{1,2,3};
		int []b= new int[]{2,1,3};
		System.out.println("hj");
		System.out.println(min_operations(a,b));
		
		
		
     
	}
	public static int min_operations(int[] arr, int[] brr) {
        // code here
       
        int count=0;
        while(arr.length>0){
            if(arr[0]==brr[0]){
                System.arraycopy(arr,1,arr,0,arr.length-1);
                count++;
            }
            else{
                arr=rotate(arr);
                count++;
            }
        }
        return count;
        
    }
    
    public static int[] rotate(int [] a){
        int first=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=first;
        return a;
    }

}
