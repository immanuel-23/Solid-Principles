package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double princliple;
	private int duration;
	private FestivalType festivaltype;
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
	 * @return the festivaltype
	 */
	public FestivalType getFestivaltype() {
		return festivaltype;
	}
	
	public FixedDeposit(String name, double princliple, int duration, FestivalType festivaltype) {
		super();
		this.name = name;
		this.princliple = princliple;
		this.duration = duration;
		this.festivaltype = festivaltype;
	}
	public double getInterestRate(FestivalType festival){
		if(festival == FestivalType.DIWALI)
			return 7.5;
		if(festival == FestivalType.CHRISTMAS)
			return 6.5;
		if(festival == FestivalType.EID)  
			return 5.5;
		return duration;                        
		
	}
	public double calculateSimpleInterest() {
		double interest=getInterestRate(this.festivaltype);
		return (princliple*duration*interest)/100;
	}
	
}
