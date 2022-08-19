package com.aurionpro.model;

public class TaxCalculator {
	logType logger;

	public TaxCalculator(logType logger) {
		super();
		this.logger = logger;
	}

	public double calculateTax(int ammount, int rate) {
		double tax = 0;
		try {
			tax = ammount / rate;
		} catch (Exception e) {
			if (logger == logType.DB)
				new DbLogger().log("Ann error in db logger");
			if (logger == logType.FILE)
				new FileLoger().log("Ann error in FILE logger");

		}

		return tax;
	}

}
