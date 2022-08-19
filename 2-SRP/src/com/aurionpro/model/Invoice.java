package com.aurionpro.model;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Product> product;

//	public void setDisplay(ArrayList<Product> product) {
//
//		this.product = product;
//
//	}
	

	public void show() {
		int total=0;
		for (Product p : this.product) {
			System.out.println("*******************************************************************************************");
			System.out.println("Id :" + p.getId());
			System.out.println("Name :" + p.getName());
			System.out.println("Ammount:" + p.getAmmount());
			System.out.println("Tax :" + calculateTax(p.getTax(), p.getAmmount()));
			System.out.println("Discount:" + calculateDiscount(p.getAmmount(), p.getDiscount()));
			System.out.println("Total:" + calculateTotal(p.getAmmount(), p.getTax(), p.getDiscount()));
			total=(int) (total+calculateTotal(p.getAmmount(), p.getTax(), p.getDiscount()));
		}
		System.out.println("\nTotal cart bill :"+total);
	}

	public Invoice(ArrayList<Product> product) {
		super();
		this.product = product;
	}

	private double calculateTax(double tax, int ammount) {
		return ((tax * ammount) / 100);
	}

	private double calculateDiscount(int ammount, double discountPercentage) {
		return (ammount *discountPercentage) / 100;
	}

	public double calculateTotal(int ammount, double tax, double discount) {
		return (ammount + calculateTax(tax, ammount) - calculateDiscount(ammount, discount));
	}
}
