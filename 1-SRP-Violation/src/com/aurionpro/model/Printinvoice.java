package com.aurionpro.model;

public class Printinvoice {

	public void printDetails(Invoice invoice) {
		System.out.println("Total :"+invoice.calculateTotal());
		System.out.println("Calculate Discount:"+invoice.calculateDiscount());
		System.out.println("Calculate tax:"+invoice.calculateTax());
		System.out.println("Description :"+invoice.getDescription());
	}
	

}
