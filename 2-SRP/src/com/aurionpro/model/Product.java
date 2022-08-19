package com.aurionpro.model;

public class Product {
	private int id;
	private String name;
	private int ammount;
	private double tax;
	private double discount;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAmmount() {
		return ammount;
	}

	public double getTax() {
		return tax;
	}

	public double getDiscount() {
		return discount;
	}

	public Product(int id, String name, int ammount, double tax, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.ammount = ammount;
		this.tax = tax;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", ammount=" + ammount + ", tax=" + tax + ", discount="
				+ discount + "]";
	}
	
	

}
