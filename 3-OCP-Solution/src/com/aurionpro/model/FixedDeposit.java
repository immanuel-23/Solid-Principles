package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double princliple;
	private int duration;
	private IInterest interest;

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the princliple
	 */
	public double getPrincliple() {
		return princliple;
	}



	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}



	/**
	 * @return the interest
	 */
	public IInterest getInterest() {
		return interest;
	}

	


	public FixedDeposit(String name, double princliple, int duration, IInterest interest) {
		super();
		this.name = name;
		this.princliple = princliple;
		this.duration = duration;
		this.interest = interest;
	}



	public double calculateSimpleInterest() {
		return (princliple * duration *this.getInterest().Interest()) / 100;
	}

}
