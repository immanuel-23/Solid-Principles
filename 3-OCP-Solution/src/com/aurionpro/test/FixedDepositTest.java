package com.aurionpro.test;

import com.aurionpro.model.Christmas;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd1= new FixedDeposit("Immanuel",10000,2,new Christmas());
		System.out.println(fd1.calculateSimpleInterest());

	}

}
