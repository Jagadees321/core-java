package com.jsp.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Man 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student("jagga",23,77));
		l.add(new Student("jagga1",24,87));
		l.add(new Student("ajay2",22,88));
		l.add(new Student("jagga3",21,97));
		Collections.sort( l,new  Age());
		
		for(Student o:l) {
			System.out.println(o);
			
		}
		System.out.println("--------------------------------");
		Collections.sort( l,new  Name());
		for(Student o:l) {
			System.out.println(o);
			
		}
		
	}

}
