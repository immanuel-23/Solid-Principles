package com.aurionpro.test;

public class VarArgsTest {
	
	static int mul(int ...arg) {
		int result=1;
		for(int a:arg) {
			result=result*a;
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Multiplication of 0 number is "+mul());
		
		System.out.println("Multiplication of 2 number is "+mul(4,5));
		System.out.println("Multiplication of 3 number is "+mul(4,5,3));
		System.out.println("Multiplication of 4 number is "+mul(4,5,9,0));
		System.out.println("Multiplication of 5 number is "+mul(4,5,1,5,7));
		System.out.println("Multiplication of 6 number is "+mul(4,5,9,7,7,1));
		System.out.println("Multiplication of 7 number is "+mul(4,5,2,3,4,5,6));
	}

}
