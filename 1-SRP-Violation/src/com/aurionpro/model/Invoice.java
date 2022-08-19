package com.aurionpro.model;

public class Invoice {

	private int id;
	private String description;
	private double ammount;
	private float tax;
	private double discountpercentage;

	public Invoice(int id, String description, double ammount, float tax, double discountpercentage) {
		super();
		this.id = id;
		this.description = description;
		this.ammount = ammount;
		this.tax = tax;
		this.discountpercentage = discountpercentage;
	}

	public String getDescription() {
		return description;
	}

	
	public int getId() {
		return id;
	}

	/**
	 * @return the ammount
	 */
	public double getAmmount() {
		return ammount;
	}

	/**
	 * @return the tax
	 */
	public float getTax() {
		return tax;
	}

	/**
	 * @return the discountpercentage
	 */
	public double getDiscountpercentage() {
		return discountpercentage;
	}

	public double calculateTax() {
		return (ammount / tax);

	}

	public double calculateDiscount() {
		return (ammount / discountpercentage) * 100;
	}

	public double calculateTotal() {
		return (ammount + (ammount / tax) - ((ammount / discountpercentage) * 100));
	}

}
