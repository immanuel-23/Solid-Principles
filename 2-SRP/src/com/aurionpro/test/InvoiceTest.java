package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Invoice;
import com.aurionpro.model.Product;

public class InvoiceTest {

	public static void main(String[] args) {
		
		ArrayList<Product> product = new ArrayList<>();
		product.add(new Product(101,"Bag",700,5,6));
		product.add(new Product(201,"Bat",500,7,2));
		product.add(new Product(301,"Laptop",70000,18,6));
		product.add(new Product(401,"Watch",2000,5,3));
		product.add(new Product(501,"Perfume",6000,5,6));
		System.out.println("*****************************************************************");
		product.forEach(System.out::println);
		System.out.println("*****************************************************************");
		Invoice invoice=new Invoice(product);
		//invoice.setDisplay(product);
		invoice.show();



	}

}
