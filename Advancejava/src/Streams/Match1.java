package Streams;

import java.util.HashSet;
import java.util.Set;

public class Match1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<String> s=new HashSet<>();
         s.add("one apple");
         s.add("one mango");
         s.add("two apples");
         s.add("many grapes");
         s.add("two guavas");
         
        boolean r =s.stream().anyMatch(n-> {return n.startsWith("one");});
        System.out.println(r);
        boolean a =s.stream().allMatch(n-> {return n.startsWith("one");});
        System.out.println(a);
        boolean b =s.stream().noneMatch(n-> {return n.startsWith("one");});
        System.out.println(r);
	}

}
