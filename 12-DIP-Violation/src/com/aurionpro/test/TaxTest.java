package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;
import com.aurionpro.model.logType;

public class TaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t1 = new TaxCalculator(logType.DB);
		System.out.println(t1.calculateTax(50, 6));
		TaxCalculator t2 = new TaxCalculator(logType.DB);
		System.out.println(t2.calculateTax(50, 0));
		TaxCalculator t3 = new TaxCalculator(logType.FILE);
		System.out.println(t3.calculateTax(50, 0));

	}

}
