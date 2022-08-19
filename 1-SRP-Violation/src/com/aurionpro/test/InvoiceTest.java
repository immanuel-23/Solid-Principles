package com.aurionpro.test;

import com.aurionpro.model.Invoice;
import com.aurionpro.model.Printinvoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice= new Invoice(1,"Hey i am invoice",4000,(float) 1.9,8);
		Printinvoice pi= new Printinvoice();
		pi.printDetails(invoice);
	}

}
