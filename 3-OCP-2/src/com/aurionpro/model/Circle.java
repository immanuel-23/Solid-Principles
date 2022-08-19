package com.aurionpro.model;

public class Circle implements IShape {
private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.142*radius*radius;
	}

}
