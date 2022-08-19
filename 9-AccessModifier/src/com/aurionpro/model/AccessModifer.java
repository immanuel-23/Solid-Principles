package com.aurionpro.model;

public class AccessModifer {
	
	private static void privateData() {
		System.out.println("Inside private data");
	}

	public static void publicData() {
		System.out.println("Inside public data");
	}

	static void defaultData() {
		System.out.println("Inside default data");
	}

	protected static void protectedData() {
		System.out.println("Inside protected data");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateData();
		publicData();
		defaultData();
		protectedData();
	}
	
	// example ever access modifer can be accessed from the same class

}
