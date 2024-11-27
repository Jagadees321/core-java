package Mapinterfacepre;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap<Integer,Integer>t=new TreeMap<>();
        t.put(1, 10);
        t.put(2, 20);
        t.put(3, 30);
       // t.put(4, 40);
        t.put(8, 50);
        //System.out.println(t);
        //t.remove(5);
//        for(int k:t.keySet()) {
//        	t.put(k, t.get(k)+5);
//        }
        //System.out.println(t.ceilingKey(4));
        System.out.println(t.floorKey(4)+""+t.ceilingKey(4));
        
        System.out.println(t);
        
        
	}

}
