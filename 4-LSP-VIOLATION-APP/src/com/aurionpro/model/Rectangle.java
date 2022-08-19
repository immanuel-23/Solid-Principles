package com.aurionpro.model;

public class Rectangle {
	private double heigth;
	private double weight;
	
	public double getHeigth() {
		return heigth;
	}
	public double getWeight() {
		return weight;
	}
	
	public Rectangle(double heigth, double weight) {
		super();
		this.heigth = heigth;
		this.weight = weight;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Rectangle [heigth=" + heigth + ", weight=" + weight + "]";
	}
	
	
	

}
