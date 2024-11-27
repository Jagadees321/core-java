package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l=new ArrayList<>();
        l.add(17);
        l.add(5);
        l.add(1);
        l.add(8);
        Collections.sort(l);
        Object[] a= l.toArray();
        System.out.println(a[1]);
        
        List<String> l1=new ArrayList<>();
        
        l1.add("h1");
        l1.add("d");
        l1.add("bgkhkhvk");
        l1.add("asjsh");
        //Collections.sort(l1, );
        System.out.println(l1);
        
	}

}
