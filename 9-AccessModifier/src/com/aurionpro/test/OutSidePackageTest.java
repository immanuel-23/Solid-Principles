package com.aurionpro.test;

import com.aurionpro.model.AccessModifer;

public class OutSidePackageTest extends AccessModifer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifer am= new AccessModifer();
		am.publicData();
		am.protectedData();
		
	}

}
