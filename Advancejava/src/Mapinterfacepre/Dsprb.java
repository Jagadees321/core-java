package Mapinterfacepre;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dsprb {

	public static void main(String[] args) {
          int n=16;
          Map<Integer,Integer> a=power(n);
          for(Map.Entry<Integer, Integer>m:a.entrySet()) {
        	  System.out.println("{"+m.getKey()+","+m.getValue()+"}");
          }



	}
	public static Map power(int n) {
		LinkedHashMap<Integer,Integer> a=new LinkedHashMap<>();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(Math.pow(i, j)==n) {
					a.put(i, j);
				}
				
			}
		}


		return a;
		
	}

}