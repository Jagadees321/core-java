package collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Maxvalueoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(5);
        l.add(7);
        l.add(7);
        boolean b=l.stream().allMatch(e->{if(e%2==0) return true;
		return false;});
        System.out.println(b);
        
	}

}
