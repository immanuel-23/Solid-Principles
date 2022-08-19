package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Sqaure;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10, 20);
		System.out.println(r1.calculateArea());
		Sqaure s1 = new Sqaure(10);
		System.out.println(s1.calculateArea());

	}

}
