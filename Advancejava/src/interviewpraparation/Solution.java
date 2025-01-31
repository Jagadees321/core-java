package interviewpraparation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
                
                
            }
            else{
            	
            	
                map.put(arr[i],map.get(arr[i])+1);
                
            }
        }
        HashSet<Integer>set=new HashSet<>();
       
       
        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
           
           if(set.contains(m.getValue())) 
           {
        	   
               return true;
           }
           set.add(m.getValue());
        }
        return false;
        
    }
    public static void main(String[] args) {
    	int[] a= {3,4,4};
    	boolean b=isFrequencyUnique(a.length,a);
    	if(b) {
    		
    		System.out.println("equal");
    		
    	}
    	else {
    		
    		System.out.println("not");
    	}
    	
	}
	
}
        