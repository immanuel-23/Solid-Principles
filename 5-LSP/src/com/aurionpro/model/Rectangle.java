package com.aurionpro.model;

public class Rectangle implements IShape {
	private double length;
	private double weight;
	
	public double getLength() {
		return length;
	}
	public double getWeight() {
		return weight;
	}
	public Rectangle(double length, double weight) {
		super();
		this.length = length;
		this.weight = weight;
	}
	
	@Override
	public double calculateArea() {
		return length*weight;
	}
	
	
}
