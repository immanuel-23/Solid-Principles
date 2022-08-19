package com.aurionpro.model;

public class Sqaure implements IShape {
	private double side;

	public double getSide() {
		return side;
	}

	public Sqaure(double side) {
		super();
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
