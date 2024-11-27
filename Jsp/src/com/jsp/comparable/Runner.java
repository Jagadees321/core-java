package com.jsp.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps=new ArrayList<>();
		laps.add(new Laptop("dell",7,1800));
		laps.add(new Laptop("hp",4,900));
		laps.add(new Laptop("lenova",9,800));
        
		Collections.sort(laps);
		for(Laptop a: laps) {
			System.out.println(a);
		}
		
	}

}
