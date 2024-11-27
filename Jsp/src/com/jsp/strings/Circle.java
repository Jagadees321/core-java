package com.jsp.strings;

public class Circle {
	private int radius;
	public Circle(int r) {
		radius=r;
		
	}
	public int getRadius() {
		return radius;
	}
	public Circle setradius(int r) {
		return new Circle(r);
		
	}

}
