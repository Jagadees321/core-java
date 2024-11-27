package geekforgeek;

import java.util.HashMap;

public class Singleoccerencevalue {
	public static void main(String[] args) {
		System.out.println(m1(new int[] {1,2,1,1}));
	}
   public static int m1(int[]arr) {
	   HashMap<Integer, Integer> h=new HashMap<>();
	   for(int a:arr) {
		   if(h.containsKey(a)) {
			   h.put(a, h.get(a)+1);
		   }else {
			   h.put(a, 1);
		   }
	   }
	   for(int n:h.keySet()) {
		   if(h.get(n)==1) {
			   return n;
		   }
	   }
	   return 0;
	   
   }
}
